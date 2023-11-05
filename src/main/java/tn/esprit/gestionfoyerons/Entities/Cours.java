package tn.esprit.gestionfoyerons.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyerons.Enum.Support;
import tn.esprit.gestionfoyerons.Enum.TypeCours;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long numCours;

    @OneToMany(mappedBy ="cours")
    private List<Inscription> inscriptions;

    private int niveau;

    @Enumerated(EnumType.STRING)
    Support support;

    @Enumerated(EnumType.STRING)
    TypeCours typeCours;

    private float prix;

    private int creneau;

}
