package com.example.getpass.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {
    @Id
    private long id;
    @Column(name = "nome")
    private String name;

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
}
