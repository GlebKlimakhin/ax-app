package com.axioma.axiomabusiness.model.entity.user;

import com.axioma.axiomabusiness.model.entity.Group;
import com.axioma.axiomabusiness.model.entity.files.ProfilePicture;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.Media;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;

    @ManyToMany
    @JoinTable(name = "users_groups",
            joinColumns = @JoinColumn(name = "user_profile_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    @JsonManagedReference
    private Set<Group> groups;

    @Column(name = "about_me")
    @Size(max = 500)
    private String aboutMe;

    @OneToOne(targetEntity = ProfilePicture.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "avatar")
    private Media avatar;

}
