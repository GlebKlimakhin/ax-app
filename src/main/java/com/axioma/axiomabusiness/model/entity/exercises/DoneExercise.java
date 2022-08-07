package com.axioma.axiomabusiness.model.entity.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "done_exercises")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoneExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    UUID id;

    int grade;

}
