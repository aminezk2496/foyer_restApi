package com.example.spring_project.services;
import com.example.spring_project.entities.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c); // ajouter l’équipe avec son détail
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
}
