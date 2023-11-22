package tn.esprit.skistation.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.skistation.Entities.Cours;

import java.util.List;

public interface CoursRepo  extends CrudRepository<Cours, Long> {
//    @Query(value = "SELECT *" +
//            "FROM cours c JOIN moniteur_cours mc on c.num_cours = mc.cours_num_cours " +
//            "JOIN moniteur m on m.num_moniteur = mc.moniteur_num_moniteur " +
//            "WHERE m.nom_m =:nameMon ", nativeQuery = true)
//    List<Cours> GetCoursByMoniteurSql(@Param("nameMon") String nameMon);

    @Query(value = "SELECT c " +
            "FROM Cours c JOIN Moniteur m on c member m.cours " +
            "WHERE m.nom_M =:nameMon ")
    List<Cours> GetCoursByMoniteurJPql(@Param("nameMon") String nameMon);

}