package org.example.models;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
@Document("users")
public class User {

    @Id
    private int id;

    private String firstname;

    private String lastname;
    @NotBlank
    private String email;
    @NotBlank
    private String password;



    public User(){}

    public User(Integer id, String firstname, String lastname, @NotBlank String email,
                @NotBlank String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;

    }

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return email == that.email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
