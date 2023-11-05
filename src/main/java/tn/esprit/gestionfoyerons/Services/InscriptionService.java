package tn.esprit.gestionfoyerons.Services;

import tn.esprit.gestionfoyerons.Entities.Inscription;

import java.util.List;

public interface InscriptionService {
    Inscription addInscription(Inscription inscription);

    Inscription updateInscription(Inscription inscription);

    boolean deleteByIdInscription(long id);

    List<Inscription> getAllInscription();

    Inscription getIdInscription(long id);

    Inscription addRegistrationAndAssignToSkieur(long idSkieur, Inscription inscription);

    Inscription addRegistrationAndAssignToCours(long idCours, Long numRegistration );
}
