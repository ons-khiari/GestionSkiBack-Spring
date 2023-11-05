package tn.esprit.gestionfoyerons.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyerons.Enum.TypeAbon;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long numAbon;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private float prixAbon;

    @Enumerated(EnumType.STRING)
    TypeAbon typeAbon;
}
