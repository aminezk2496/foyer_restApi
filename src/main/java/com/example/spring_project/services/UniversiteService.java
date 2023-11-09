package com.example.spring_project.services;

import com.example.spring_project.entities.Universite;
import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversity (Universite u);
    Universite updateUniversity (Universite u);
    Universite retrieveUniversity (long idUniversity);
}
