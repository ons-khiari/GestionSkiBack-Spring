package tn.esprit.gestionfoyerons.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long numSkieur;

    @ManyToMany
    Set<Piste> pistes;

    @JsonIgnore
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;

    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement Abon;

    private String nomSkieur;

    private String prenomSkieur;

    private LocalDate dateNaissance;

    private String ville;
}
