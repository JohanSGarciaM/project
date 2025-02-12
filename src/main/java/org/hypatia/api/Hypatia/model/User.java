package org.hypatia.api.Hypatia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hypatia.api.Hypatia.dto.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String email;
    @Setter
    private String name;
    @Setter
    private String lastName;
    @Setter
    private String password;

    public User(UserDto userDto) {
        this.email = userDto.getEmail();
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.password = userDto.getPassword();
    }
}
