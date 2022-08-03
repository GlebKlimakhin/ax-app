package com.axioma.axiomabusiness.repository.exercise;

import com.axioma.axiomabusiness.model.entity.AbstractExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractExerciseRepository<E extends AbstractExercise> extends JpaRepository<E, Long> {

}
