package com.exampleMVC.ejemploMVCPersonaSQL2.personaController;

import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.Persona;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.User;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaService.PersonaService;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaService.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    private PersonaService service;
    private UserService userService;

    public FrontController(PersonaService service, UserService userService){
        this.service=service;
        this.userService=userService;
    }
    @GetMapping("/")
    public String iniciar(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            System.out.println(principal.getClaims());
            User user = this.userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user",user);
        }
        return "index";
    }

    @GetMapping("/personal")
    public String getPersonas(Model model){
        List<Persona> personas = this.service.getLstpersonas();
        model.addAttribute("personas",personas);
        return "personas";
    }

    @GetMapping("/personal/nueva")
    public String crearPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "agregarpersonas";
    }

}
