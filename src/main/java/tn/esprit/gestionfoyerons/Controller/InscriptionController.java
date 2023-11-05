package tn.esprit.gestionfoyerons.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerons.Entities.Inscription;
import tn.esprit.gestionfoyerons.Services.InscriptionServiceImp;

@RestController
@RequestMapping("inscription")
@RequiredArgsConstructor
public class InscriptionController {

    private final InscriptionServiceImp inscriptionServiceImp;

    @PostMapping("{idSkieur}")
    public Inscription addRegistrationAndAssignToSkieur(@PathVariable long idSkieur, @RequestBody Inscription inscription){
        return inscriptionServiceImp.addRegistrationAndAssignToSkieur(idSkieur,inscription);
    }

    @PostMapping("{idCours}/{numRegistration}")
    public Inscription addRegistrationAndAssignToCours(@PathVariable long numRegistration, @PathVariable long idCours){
        return inscriptionServiceImp.addRegistrationAndAssignToCours(idCours,numRegistration);
    }
}
