package com.axioma.axiomabusiness.model.entity.files;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Validated
@Entity
@Table(name = "profile_pictures")
public class ProfilePicture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Column(name = "size")
    private Long size;

    @Column(name = "size_blocks")
    private Integer scaleInBlocks;

    @Column(name = "is_preview",
            columnDefinition = "boolean default false")
    private boolean isPreview;

    @NotBlank
    @Column(name = "content_type")
    private String contentType;

    private String name;

    @NotBlank
    private String link;

}
