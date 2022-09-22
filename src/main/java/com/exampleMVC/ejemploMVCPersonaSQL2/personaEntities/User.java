package com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "image")
    private String image;
    @Column(name = "auth0Id", unique = true)
    private String auth0Id;

    public User() {
    }

    public User(String nombre, String email, String image, String auth0Id) {
        this.nombre = nombre;
        this.email = email;
        this.image = image;
        this.auth0Id = auth0Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }
}
