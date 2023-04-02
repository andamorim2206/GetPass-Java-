package com.example.getpass.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @Id
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "senha")
    private String password;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "crendentials")
    private List<Crendentials> crendentials;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
