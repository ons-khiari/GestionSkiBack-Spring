package tn.esprit.gestionfoyerons.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerons.Entities.Cours;
import tn.esprit.gestionfoyerons.Entities.Inscription;
import tn.esprit.gestionfoyerons.Entities.Skieur;
import tn.esprit.gestionfoyerons.Repository.CoursRepository;
import tn.esprit.gestionfoyerons.Repository.InscriptionRepository;
import tn.esprit.gestionfoyerons.Repository.SkieurRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InscriptionServiceImp implements InscriptionService{

    private final InscriptionRepository inscriptionRepository;
    private final SkieurRepository skieurRepository;
    private final CoursRepository coursRepository;

    @Override
    public Inscription addInscription(Inscription inscription) {
        return null;
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return null;
    }

    @Override
    public boolean deleteByIdInscription(long id) {
        return false;
    }

    @Override
    public List<Inscription> getAllInscription() {
        return null;
    }

    @Override
    public Inscription getIdInscription(long id) {
        return null;
    }

    @Override
    public Inscription addRegistrationAndAssignToSkieur(long idSkieur, Inscription inscription){
        Skieur skieur = skieurRepository.findById(idSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription addRegistrationAndAssignToCours(long idCours, Long numRegistration ){
        Cours cours = coursRepository.findById(idCours).orElse(null);
        Inscription inscription = inscriptionRepository.findById(numRegistration).orElse(null);

        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }
}
