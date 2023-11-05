package tn.esprit.gestionfoyerons.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.gestionfoyerons.Entities.Skieur;
import tn.esprit.gestionfoyerons.Enum.Couleur;
import tn.esprit.gestionfoyerons.Enum.Support;
import tn.esprit.gestionfoyerons.Enum.TypeAbon;
import tn.esprit.gestionfoyerons.Enum.TypeCours;

import java.util.List;

public interface SkieurRepository extends CrudRepository<Skieur, Long> {
    List<Skieur> findByAbonTypeAbon(TypeAbon abon_typeAbon);
    List<Skieur> findByAbonTypeAbonAndPistesCouleurAndInscriptionsCoursSupportAndInscriptionsCoursTypeCours(TypeAbon abon_typeAbon, Couleur pistes_couleur, Support inscriptions_cours_support, TypeCours inscriptions_cours_typeCours);

    @Query(value = "SELECT *" +
            "FROM skieur s" +
            "JOIN inscription insc ON s.num_skieur = insc.skieur_num_skieur" +
            "JOIN moniteur_cours mc ON insc.cours_num_cours = mc.cours_num_cours" +
            "JOIN moniteur m ON m.num_moniteur = mc.moniteur_num_moniteur" +
            "WHERE m.nomM = : nameMon", nativeQuery = true)
    List<Skieur> GetSkieurByMoniteurNameSql(@Param("nameMon") String nameMon);

    @Query("SELECT insc.skieur " +
            "FROM Inscription insc " +
            "JOIN Moniteur m ON insc.cours member m.cours " +
            "WHERE m.nomM = : nameMon")
    List<Skieur> GetSkieurByMoniteurNameJPqr(@Param("nameMon") String nameMon);
}
