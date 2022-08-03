package com.axioma.axiomabusiness.controller;

import com.axioma.axiomabusiness.model.entity.reading.ReadingSpeedExercise;
import com.axioma.axiomabusiness.service.ReadingExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/v1/reading")
public class ReadingExerciseController {

    private ReadingExerciseService exerciseService;

    @Autowired
    public void setExerciseService(ReadingExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/{id}")
    public ReadingSpeedExercise findById(@PathVariable Long id) {
        return exerciseService.findById(id).orElseThrow(() -> new EntityNotFoundException("No such exercise"));
    }
}
