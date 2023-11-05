package tn.esprit.gestionfoyerons.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionfoyerons.Entities.Inscription;

public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}
