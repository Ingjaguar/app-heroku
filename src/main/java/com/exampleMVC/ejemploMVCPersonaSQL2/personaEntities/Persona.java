package com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name="Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;

    public Persona() {
    }

    public Persona(long id, String nombre, String apellido, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
}
