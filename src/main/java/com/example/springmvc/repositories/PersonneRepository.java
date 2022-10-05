package com.example.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmvc.models.Personne;

// Data Access Object
@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer>{
	
}
