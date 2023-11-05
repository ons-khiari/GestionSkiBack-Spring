package tn.esprit.gestionfoyerons.Services;

import tn.esprit.gestionfoyerons.Entities.Inscription;
import tn.esprit.gestionfoyerons.Entities.Skieur;

import java.util.List;

public interface SkieurService {
    Skieur addSkieur(Skieur skieur);

    Skieur updateSkieur(Skieur skieur);

    boolean deleteByIdSkieur(long id);

    List<Skieur> getAllSkieur();

    Skieur getIdSkieur(long id);

    Skieur addSkieurAndAssignToCours(long idCours, Skieur skieur );
}
