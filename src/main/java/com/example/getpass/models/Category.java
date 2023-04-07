package com.example.getpass.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {
    @Id
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "user", referencedColumnName = "id")
    private User user_id;

    @OneToMany(mappedBy = "category")
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

    public User getUser(){ return user_id;}

    public void setUser(User user_id){ this.user_id = user_id; }

    public List<Crendentials> getCredentials() {
        return crendentials;
    }

    public void setCredentials(List<Crendentials> credentials) {
        this.crendentials = credentials;
    }
}
