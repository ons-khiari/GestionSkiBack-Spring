package tn.esprit.gestionfoyerons.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long numInscription;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;

    private int numSemaine;
}
