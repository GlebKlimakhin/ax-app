package com.axioma.axiomabusiness.service.exercise;

import com.axioma.axiomabusiness.model.entity.AbstractExercise;
import com.axioma.axiomabusiness.model.entity.reading.ReadingSpeedExercise;
import com.axioma.axiomabusiness.repository.exercise.ReadingExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReadingExerciseService implements AbstractExerciseService<Reading> {

    private ReadingExerciseRepository exerciseRepository;

    @Autowired
    public void setExerciseRepository(ReadingExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public AbstractExercise save(AbstractExercise entity) {
        return null;
    }

    public Optional<ReadingSpeedExercise> findById(long id) {
        return exerciseRepository.findById(id);
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void delete() {

    }


}
