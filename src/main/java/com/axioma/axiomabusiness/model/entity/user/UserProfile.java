package com.axioma.axiomabusiness.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class UserProfile {
    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Table(name = "user_profiles")
    public class UserProfile {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;

        @Column(name = "date_of_birth")
        private LocalDateTime dateOfBirth;

        @ManyToMany
        @JoinTable(name = "user_profiles_languages",
                joinColumns = @JoinColumn(name = "user_profile_id"),
                inverseJoinColumns = @JoinColumn(name = "language_id"))
        @JsonManagedReference
        private Set<Group> groups;

        @Column(name = "about_me")
        @Size(max = 500)
        private String aboutMe;

        @OneToOne(targetEntity = MediaFile.class, fetch = FetchType.EAGER)
        @JoinColumn(name = "avatar")
        private Media avatar;

    }
}
