package com.exampleMVC.ejemploMVCPersonaSQL2.personaService;

import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.Persona;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.User;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaRepository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser (User newUser){
        return this.userRepository.save(newUser);
    }
    public User findUserByEmail (String email){
        return this.userRepository.findByEmail(email);
    }
    public User getOrCreateUser(Map<String, Object> Userdata){

        String email = (String) Userdata.get("email");
        User user = findUserByEmail(email);
        if (user==null){
            String name = (String) Userdata.get("name");
            String image = (String) Userdata.get("picture");
            String auth0Id = (String) Userdata.get("sub");
            User newUser = new User(email=email, name=name, image=image, auth0Id=auth0Id);
            return createUser(newUser);
        }
        return user;
    }
}
