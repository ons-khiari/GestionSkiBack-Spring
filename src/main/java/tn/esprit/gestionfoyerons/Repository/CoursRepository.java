package tn.esprit.gestionfoyerons.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.gestionfoyerons.Entities.Cours;

import java.util.List;


public interface CoursRepository extends CrudRepository<Cours, Long>{
    @Query(value = "SELECT *" +
            "FROM cours c JOIN moniteur_cours mc ON c.num_cours = mc.cours_num_cours" +
            "JOIN moniteur m ON m.num_moniteur = mc.moniteur_num_moniteur" +
            "WHERE m.nomM = :nameMon", nativeQuery = true)
    List<Cours> GetCoursByMoniteurSql(@Param("nameMon") String nameMon);

    @Query(value = "SELECT c" +
            "FROM Cours c "+
            "JOIN Moniteur m ON c member m.cours" +
            "WHERE m.nomM = :nameMon", nativeQuery = true)
    List<Cours> GetCoursByMoniteurJPqr(@Param("nameMon") String nameMon);
}
