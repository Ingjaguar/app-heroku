package com.exampleMVC.ejemploMVCPersonaSQL2.personaService;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.Persona;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaRepository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService {
    private PersonaRepository repository;

    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }
    public List<Persona> getLstpersonas(){
        return this.repository.findAll();
    }

    public Persona crearpersona(Persona unaPersona){
        return this.repository.save(unaPersona);
    }

    public Boolean borrarPersona(Long id){
        this.repository.deleteById(id);
        return true;
    }
}
