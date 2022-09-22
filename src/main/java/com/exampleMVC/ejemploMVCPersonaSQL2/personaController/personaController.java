package com.exampleMVC.ejemploMVCPersonaSQL2.personaController;

import com.exampleMVC.ejemploMVCPersonaSQL2.personaEntities.Persona;
import com.exampleMVC.ejemploMVCPersonaSQL2.personaService.PersonaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class personaController {
    private PersonaService service;

    public personaController(PersonaService service) {
        this.service = service;
    }

    /*@GetMapping("/lista")
    public List<Persona> listaPersonas(){
        return this.service.getLstpersonas();
    }*/
    @GetMapping("/personal/eliminar/{id}")
    public RedirectView borrarPersona(@PathVariable("id") Long id){
        this.service.borrarPersona(id);
        return new RedirectView("/personal");
    }

    @PostMapping("/personal")
    public RedirectView crearPersona(@ModelAttribute Persona persona, Model model){
        model.addAttribute(persona);
        this.service.crearpersona(persona);
        return new RedirectView("/personal");
    }


}
