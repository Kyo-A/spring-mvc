package com.example.springmvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Declare cette classe comme entite a mapper ds la db
public class Personne {

	@Id // Declare ce champs comme PK (cle primaire)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Declare AUTO_INCREMENT sur le champs id
	private Integer id;
	private String nom;

	public Personne() {
		super();
	}

	public Personne(Integer id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void afficher() {
		System.out.println(id + " " + nom);
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + "]";
	}
}
