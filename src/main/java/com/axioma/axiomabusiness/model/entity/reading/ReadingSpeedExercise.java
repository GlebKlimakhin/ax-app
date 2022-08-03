package com.axioma.axiomabusiness.model.entity.reading;

import com.axioma.axiomabusiness.model.entity.AbstractExercise;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@DiscriminatorValue("Reading")
public class ReadingSpeedExercise extends AbstractExercise {

//    int speed;
//    int symbolQuantity;
//    int symbolQuantityWithoutSpace;
//    String endWord;

    //todo

}
