package tn.esprit.gestionfoyerons.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyerons.Enum.Couleur;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long numPiste;

    @ManyToMany(mappedBy = "pistes")
    Set<Skieur> skieurs;


    private String nomPiste;

    private int longeur;

    @Enumerated(EnumType.STRING)
    Couleur couleur;

    private int pente;


}
