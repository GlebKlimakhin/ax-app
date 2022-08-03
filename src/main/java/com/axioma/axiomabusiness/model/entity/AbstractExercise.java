package com.axioma.axiomabusiness.model.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class AbstractExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "data", nullable = false)
    String data;

    @Column(name = "created_at")
    @CreationTimestamp
    Date createdAt;


}
