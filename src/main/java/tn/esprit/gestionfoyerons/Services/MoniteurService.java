package tn.esprit.gestionfoyerons.Services;

import tn.esprit.gestionfoyerons.Entities.Moniteur;
import tn.esprit.gestionfoyerons.Entities.Skieur;

import java.util.List;

public interface MoniteurService {
    Moniteur addSkieur(Moniteur moniteur);

    Moniteur updateMoniteur(Moniteur moniteur);

    boolean deleteByIdMoniteur(long id);

    List<Moniteur> getAllMoniteur();

    Moniteur getIdMoniteur(long id);
}
