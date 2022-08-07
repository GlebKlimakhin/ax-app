package com.axioma.axiomabusiness.repository.exercise;

import com.axioma.axiomabusiness.model.entity.exercises.AbstractExercise;
import com.axioma.axiomabusiness.model.entity.exercises.ExerciseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbstractExerciseRepository<E extends AbstractExercise> extends JpaRepository<AbstractExercise, String> {

    List<AbstractExercise> findAllByType(ExerciseType exerciseType);

}
