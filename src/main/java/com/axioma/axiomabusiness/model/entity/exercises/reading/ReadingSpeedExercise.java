package com.axioma.axiomabusiness.model.entity.exercises.reading;

import com.axioma.axiomabusiness.model.entity.exercises.AbstractExercise;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("reading_speed")
public class ReadingSpeedExercise extends AbstractExercise {

    int score;
    //todo

}
