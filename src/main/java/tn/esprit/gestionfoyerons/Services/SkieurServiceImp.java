package tn.esprit.gestionfoyerons.Services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerons.Entities.Abonnement;
import tn.esprit.gestionfoyerons.Entities.Cours;
import tn.esprit.gestionfoyerons.Entities.Inscription;
import tn.esprit.gestionfoyerons.Entities.Skieur;
import tn.esprit.gestionfoyerons.Repository.CoursRepository;
import tn.esprit.gestionfoyerons.Repository.InscriptionRepository;
import tn.esprit.gestionfoyerons.Repository.SkieurRepository;

import java.util.HashSet;
import java.util.List;

@Service
public class SkieurServiceImp implements  SkieurService{

    @Autowired
    SkieurRepository skieurRepo;

    CoursRepository coursRepository;

    InscriptionRepository inscriptionRepository;


    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public boolean deleteByIdSkieur(long id) {
        skieurRepo.deleteById(id);
        return !(skieurRepo.existsById(id));
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return (List<Skieur>) skieurRepo.findAll();

    }

    @Override
    public Skieur getIdSkieur(long id) {
        return skieurRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("no cours found with this id"));
    }

    @Transactional
    @Override
    public Skieur addSkieurAndAssignToCours(long idCours, Skieur skieur ){

        //recuperation des objets
        Cours cours = coursRepository.findById(idCours).orElse(null);

        //Abonnement abonnement = skieur.getAbon();
        Inscription inscription = skieur.getInscriptions().stream().findFirst().get();

        inscription.setSkieur(skieur);
        inscription.setCours(cours);
        //skieur.setInscriptions(new HashSet<>());

        skieurRepo.save(skieur);
        inscriptionRepository.save(inscription);

        return skieur;
    }
}
