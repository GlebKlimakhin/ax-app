package com.axioma.axiomabusiness.model.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Arithmetics")
public abstract class ArithmeticExercise extends AbstractExercise {

    @Column(name = "is_correct")
    Boolean isCorrect;

    @Column(name = "data")
    String data;
}
