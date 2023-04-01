package com.example.getpass.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anotacoes")
public class Annotation {
    @Id
    private long id;

    @Column (name = "titulo")
    private String title;

    @Column (name = "conteudo")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(){
        this.content = content;
    }


}
