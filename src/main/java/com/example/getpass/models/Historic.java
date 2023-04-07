package com.example.getpass.models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Historic {
    @Id
    private long id;

    @Column(name = "old_username")
    private String old_username;

    @Column(name = "old_password")
    private String old_password;

    @Column(name = "change_date")
    private String change_date;

    @ManyToOne
    @JoinColumn(name = "crendetials", referencedColumnName = "id")
    private Crendentials crendentials_id;


    public String getOldUsername() {
        return old_username;
    }

    public void setOldUsername(String old_username) {
        this.old_username = old_username;
    }

    public String getPassword() {
        return old_password;
    }

    public void setPassword(String password) {
        this.old_username = old_password;
    }

    public Crendentials getCrendetials(){return crendentials_id;}

    public void setCrendentials(Crendentials crendentials_id){ this.crendentials_id = crendentials_id;}

}
