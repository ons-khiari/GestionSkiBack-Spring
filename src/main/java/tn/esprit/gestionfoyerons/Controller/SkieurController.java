package tn.esprit.gestionfoyerons.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerons.Entities.Inscription;
import tn.esprit.gestionfoyerons.Entities.Skieur;
import tn.esprit.gestionfoyerons.Services.SkieurService;
import tn.esprit.gestionfoyerons.Services.SkieurServiceImp;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurController {

    private final SkieurService skieurService;

    @GetMapping
    public List<Skieur> getAllSkieur(){
        return skieurService.getAllSkieur();
    }

    @GetMapping("{id}")
    public Skieur getIdSkieur(@PathVariable long id){
        return skieurService.getIdSkieur(id);
    }

    @PutMapping
    public Skieur updateSkieyr(@RequestBody Skieur skieur){
        return skieurService.updateSkieur(skieur);
    }

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }

    public InscriptionController inscriptionController;

    @PostMapping("{idCours}")
    public Skieur addSkieurAndAssignToCours(@PathVariable long idCours,@RequestBody Skieur skieur){
        return skieurService.addSkieurAndAssignToCours(idCours,skieur);
    }

}
