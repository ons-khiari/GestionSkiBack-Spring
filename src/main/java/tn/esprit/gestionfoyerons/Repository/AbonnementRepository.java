package tn.esprit.gestionfoyerons.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionfoyerons.Entities.Abonnement;
import tn.esprit.gestionfoyerons.Enum.TypeAbon;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
    List<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbon typeAbon);
    List <Abonnement> findByDateDebutAfterAndDateFinBefore(LocalDate dateDebut, LocalDate dateFin);
}
