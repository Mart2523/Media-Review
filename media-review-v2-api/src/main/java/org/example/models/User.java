package org.example.models;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
@Document("users")
public class User {

    private String firstname;

    private String lastname;
    @NotBlank
    private String username;
    @NotBlank
    private String password;



    public User(){}

    public User(String firstname, String lastname, @NotBlank String username,
                @NotBlank String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return username == that.username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
