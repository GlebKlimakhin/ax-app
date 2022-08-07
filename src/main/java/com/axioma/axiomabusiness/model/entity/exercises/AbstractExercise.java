package com.axioma.axiomabusiness.model.entity.exercises;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "exercises")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class AbstractExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id", updatable = false, insertable = false)
    UUID id;

    @Column(name = "data", nullable = false)
    String data;

    @Column(name = "created_at")
    @CreationTimestamp
    Date createdAt;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "type", insertable = false, updatable = false)
    ExerciseType type;


}
