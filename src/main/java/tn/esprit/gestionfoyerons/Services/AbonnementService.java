package tn.esprit.gestionfoyerons.Services;

import tn.esprit.gestionfoyerons.Entities.Abonnement;

import java.util.List;

public interface AbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement(Abonnement abonnement);

    boolean deleteByIdAbonnement(long id);

    List<Abonnement> getAllAbonnement();

    Abonnement getIdAbonnement(long id);
}
