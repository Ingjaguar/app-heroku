package com.exampleMVC.ejemploMVCPersonaSQL2.personaRepository;

import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
