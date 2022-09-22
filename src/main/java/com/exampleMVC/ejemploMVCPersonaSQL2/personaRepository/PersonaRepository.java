package com.exampleMVC.ejemploMVCPersonaSQL2.personaRepository;

import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
