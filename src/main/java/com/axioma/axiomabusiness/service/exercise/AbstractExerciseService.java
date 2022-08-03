package com.axioma.axiomabusiness.service.exercise;

import com.axioma.axiomabusiness.model.entity.AbstractExercise;

import java.util.List;
import java.util.Optional;

public interface AbstractExerciseService <E extends AbstractExercise> {

    E save(E entity);

    Optional<E> findById(long id);

    List<E> findAll();

    void delete();

}
