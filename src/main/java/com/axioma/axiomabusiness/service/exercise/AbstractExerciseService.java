package com.axioma.axiomabusiness.service.exercise;

import com.axioma.axiomabusiness.model.entity.exercises.AbstractExercise;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AbstractExerciseService <E extends AbstractExercise> {

    AbstractExercise save(E entity);

    Optional<AbstractExercise> findById(UUID id);

    List<AbstractExercise> findAll();

}
