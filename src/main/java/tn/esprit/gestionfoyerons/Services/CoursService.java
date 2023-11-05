package tn.esprit.gestionfoyerons.Services;

import tn.esprit.gestionfoyerons.Entities.Cours;

import java.util.List;

public interface CoursService {
    Cours addCours(Cours c);

    Cours update(Cours c);

    List<Cours> getAll();

    Cours getById(Long id);

    Boolean deleteById(Long id);
}
