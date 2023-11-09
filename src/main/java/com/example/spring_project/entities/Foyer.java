package com.example.spring_project.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idFoyer;
    String nomFoyer;
    long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyerBloc")
    private List<Bloc> blocList;

}
