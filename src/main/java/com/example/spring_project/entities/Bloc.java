package com.example.spring_project.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Foyer foyerBloc ;
    @OneToMany(mappedBy ="blocChambre" )
    private List<Chambre> chambreList;

}
