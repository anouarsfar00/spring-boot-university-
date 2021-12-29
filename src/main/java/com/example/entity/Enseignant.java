package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "enseignant")
@JsonIgnoreType
public class Enseignant implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricule;
	private String nomENS;
	private String prenomENS;
	private String adresseENS;
	private String diplome;
	@ManyToOne
	@JsonIgnore
	private Cours cours;
	@ManyToOne
	@JsonIgnore
	private Departement departementEns;
	@ManyToMany
	@JoinTable(name = "Fillier", joinColumns = @JoinColumn, inverseJoinColumns = @JoinColumn)
	@JsonIgnore
	List<Etudiant> listEtudiant;

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Departement getDepartementEns() {
		return departementEns;
	}

	public void setDepartementEns(Departement departementEns) {
		this.departementEns = departementEns;
	}

	public Long getMatricule() {
		return matricule;
	}

	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}

	public String getNomENS() {
		return nomENS;
	}

	public void setNomENS(String nomENS) {
		this.nomENS = nomENS;
	}

	public String getPrenomENS() {
		return prenomENS;
	}

	public void setPrenomENS(String prenomENS) {
		this.prenomENS = prenomENS;
	}

	public String getAdresseENS() {
		return adresseENS;
	}

	public void setAdresseENS(String adresseENS) {
		this.adresseENS = adresseENS;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Departement getDepartements() {
		return departementEns;
	}

	public void setDepartements(Departement departements) {
		this.departementEns = departements;
	}

	public Enseignant(String nomENS, String prenomENS, String adresseENS, String diplome) {
		super();
		this.nomENS = nomENS;
		this.prenomENS = prenomENS;
		this.adresseENS = adresseENS;
		this.diplome = diplome;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}

	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}

	public Enseignant(Long matricule, String nomENS, String prenomENS, String adresseENS, String diplome, Cours cours,
			Departement departementEns, List<Etudiant> listEtudiant) {
		super();
		this.matricule = matricule;
		this.nomENS = nomENS;
		this.prenomENS = prenomENS;
		this.adresseENS = adresseENS;
		this.diplome = diplome;
		this.cours = cours;
		this.departementEns = departementEns;
		this.listEtudiant = listEtudiant;
	}

	@Override
	public String toString() {
		return "Enseignant [matricule=" + matricule + ", nomENS=" + nomENS + ", prenomENS=" + prenomENS
				+ ", adresseENS=" + adresseENS + ", diplome=" + diplome + ", cours=" + cours + ", departementEns="
				+ departementEns + ", ListEtudiant=" + listEtudiant + ", getCours()=" + getCours()
				+ ", getDepartementEns()=" + getDepartementEns() + ", getMatricule()=" + getMatricule()
				+ ", getNomENS()=" + getNomENS() + ", getPrenomENS()=" + getPrenomENS() + ", getAdresseENS()="
				+ getAdresseENS() + ", getDiplome()=" + getDiplome() + ", getDepartements()=" + getDepartements()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
