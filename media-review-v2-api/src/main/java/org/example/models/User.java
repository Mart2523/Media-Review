package org.example.models;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Document("users")
public class User {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private @Id String id = UUID.randomUUID().toString();
    private String firstname;

    private String lastname;
    @NotNull
    private String email;
    @NotNull
    private String pwHash;

    private boolean loggedIn;

    public User (){}


    public User(String id, String firstname, String lastname, String email,
                String password, boolean loggedIn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.pwHash= encoder.encode(password);
        this.loggedIn = loggedIn;

    }


    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPwHash() {
        return pwHash;
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





    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
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
