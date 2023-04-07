package com.example.getpass.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="crendentials")
public class Crendentials {
    @Id
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    @ManyToOne
    @JoinColumn(name = "user", referencedColumnName = "id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category_id;

    @OneToMany(mappedBy = "crendentials")
    private List<Historic> historics;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

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

    public User getUser(){ return user_id;}

    public void setUser(User user_id){ this.user_id = user_id; }

    public Category getCategory(){return category_id;}

    public void setCategory(Category category_id){ this.category_id = category_id;}

    public List<Historic> getHistorics() {
        return historics;
    }

    public void setHistorics(List<Historic> historics) {
        this.historics = historics;
    }

}
