package tn.esprit.gestionfoyerons.Services;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerons.Entities.Cours;
import tn.esprit.gestionfoyerons.Repository.CoursRepository;

import java.util.List;

@Service
public class CoursServiceImp implements CoursService{

    @Autowired
    CoursRepository coursrepo;

    @Override
    public Cours addCours(Cours c) {
        return coursrepo.save(c);
    }

    @Override
    public Cours update(Cours c) {
        return coursrepo.save(c);
    }

    @Override
    public List<Cours> getAll() {
        return (List<Cours>) coursrepo.findAll();
    }

    @Override
    public Cours getById(Long id) {
        return coursrepo.findById(id).orElseThrow(() -> new IllegalArgumentException("no course found with this ID:"+ id));
        //return coursrepo.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteById(Long id) {
        coursrepo.deleteById(id);
        return coursrepo.existsById(id);
    }
}
