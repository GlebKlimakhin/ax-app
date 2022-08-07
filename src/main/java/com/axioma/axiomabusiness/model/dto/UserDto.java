package com.axioma.axiomabusiness.model.dto;

import com.axioma.axiomabusiness.model.entity.files.ProfilePicture;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    Long id;
    String firstname;
    String surname;
    ProfilePicture pfp;

}
