package com.axioma.axiomabusiness.service.exercise.speed;

import com.axioma.axiomabusiness.model.entity.exercises.AbstractExercise;
import com.axioma.axiomabusiness.model.entity.exercises.ExerciseType;
import com.axioma.axiomabusiness.model.entity.exercises.reading.ReadingSpeedExercise;
import com.axioma.axiomabusiness.repository.exercise.AbstractExerciseRepository;
import com.axioma.axiomabusiness.service.exercise.AbstractExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SpeedExerciseService implements AbstractExerciseService<ReadingSpeedExercise> {

    private AbstractExerciseRepository<ReadingSpeedExercise> exerciseRepository;

    @Autowired
    public void setExerciseRepository(AbstractExerciseRepository<ReadingSpeedExercise> exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public ReadingSpeedExercise save(ReadingSpeedExercise readingSpeedExercise) {
        return exerciseRepository.save(readingSpeedExercise);
    }

    @Override
    public Optional<AbstractExercise> findById(UUID id) {
        return exerciseRepository.findAllByType(ExerciseType.READING_SPEED_EXERCISE)
                .stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    @Override
    public List<AbstractExercise> findAll() {
        return exerciseRepository.findAll();
    }

}
