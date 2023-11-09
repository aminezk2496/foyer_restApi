package com.example.spring_project.repositories;

import com.example.spring_project.entities.Bloc;
import com.example.spring_project.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlocRepo  extends JpaRepository<Bloc,Integer> {

//    @Query("select b from Bloc b where b.foyerBloc=?1")
//    List<Bloc> gelblocfoyer(Foyer foyer);
    List<Bloc> findAllByFoyerBloc(Foyer foyer);
}
