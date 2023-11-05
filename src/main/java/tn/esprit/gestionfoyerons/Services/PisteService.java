package tn.esprit.gestionfoyerons.Services;

import tn.esprit.gestionfoyerons.Entities.Piste;

import java.util.List;

public interface PisteService {
    Piste addPiste(Piste piste);

    Piste updatePiste(Piste piste);

    boolean deleteByIdPiste(long id);

    List<Piste> getAllPiste();

    Piste getIdPiste(long id);
}
