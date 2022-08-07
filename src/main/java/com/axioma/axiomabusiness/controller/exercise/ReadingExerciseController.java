package com.axioma.axiomabusiness.controller.exercise;

import com.axioma.axiomabusiness.model.entity.exercises.AbstractExercise;
import com.axioma.axiomabusiness.model.entity.exercises.reading.ReadingSpeedExercise;
import com.axioma.axiomabusiness.service.exercise.speed.SpeedExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/reading")
public class ReadingExerciseController{

    private SpeedExerciseService exerciseService;

    @Autowired
    public void setExerciseService(SpeedExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/{id}")
    public AbstractExercise findById(@PathVariable UUID id) {
        return exerciseService.findById(id).orElseThrow(() -> new EntityNotFoundException("No such exercise"));
    }
}
