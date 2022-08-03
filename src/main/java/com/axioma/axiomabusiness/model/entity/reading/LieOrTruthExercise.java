package com.axioma.axiomabusiness.model.entity.reading;

import com.axioma.axiomabusiness.model.entity.AbstractExercise;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "lie_or_truth_exercise")
@Getter
@Setter
public class LieOrTruthExercise extends AbstractExercise {

    @Column(name = "questions")
    String questions;

}
