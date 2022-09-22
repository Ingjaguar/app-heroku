package com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
    private List<Persona> personaList;
    public ListaPersonas() {
        this.personaList = new ArrayList<>();
    }
    public List<Persona> getPersonaList(){
        return personaList;
    }
    public void agregarPersona(Persona persona){
        this.personaList.add(persona);
    }
}
