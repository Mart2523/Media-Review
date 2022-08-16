package org.example.models;
import javax.validation.constraints.NotBlank;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Users")
public class User {
    @Id
    private String ID;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
