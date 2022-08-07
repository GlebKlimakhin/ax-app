package com.axioma.axiomabusiness.model.entity.user;

import com.axioma.axiomabusiness.model.entity.Group;
import com.axioma.axiomabusiness.model.entity.Homework;
import com.axioma.axiomabusiness.model.entity.Role;
import com.axioma.axiomabusiness.model.entity.exercises.AbstractExercise;
import com.axioma.axiomabusiness.model.entity.exercises.reading.ReadingSpeedExercise;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @NotNull
    @Size(min = 6, max = 255,
            message = "Minimum size for username is 6 and Maximum size is 255")
    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "password", nullable = false)
    @NotNull
    String password;

    @Column(name = "firstname", nullable = false)
    @Size(min = 3, max = 15,
            message = "Minimum size for fullName is 4 and Maximum size is 60")
    @NotNull
    String firstname;

    @Column(name = "surname", nullable = false)
    @Size(min = 3, max = 15,
            message = "Minimum size for fullName is 4 and Maximum size is 60")
    @NotNull
    String surname;

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    Date createdAt;

    @ManyToMany
            @JoinTable(name = "users_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    List<Group> groups;

    @ManyToMany
            @JoinTable(name = "users_homeworks",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    List<Homework> homeworks;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_homeworks",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @JsonManagedReference
    Set<Role> roles;

    @ManyToMany
            @JoinTable(name = "users_exercises",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id"))
    List<AbstractExercise> exercises;

    // todo image pfp
}
