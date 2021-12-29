package com.example.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "etudiant")
@JsonIgnoreType
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numInscription;
	private String nameETU;
	private String prenomETU;
	private String adresseETU;
	@CreationTimestamp
	private Date dateEntree;
	@ManyToMany
	@JsonIgnore
	private List<Cours> listCours;
	@ManyToMany(mappedBy = "listEtudiant")
	@JsonIgnore
	private List<Enseignant> listEnseignant;

	public List<Cours> getListCours() {
		return listCours;
	}

	public void setListCours(List<Cours> listCours) {
		this.listCours = listCours;
	}

	public List<Enseignant> getListEnseignant() {
		return listEnseignant;
	}

	public void setListEnseignant(List<Enseignant> listEnseignant) {
		this.listEnseignant = listEnseignant;
	}

	public Long getNumInscription() {
		return numInscription;
	}

	public void setNumInscription(Long numInscription) {
		this.numInscription = numInscription;
	}

	public String getNameETU() {
		return nameETU;
	}

	public void setNameETU(String nameETU) {
		this.nameETU = nameETU;
	}

	public String getPrenomETU() {
		return prenomETU;
	}

	public void setPrenomETU(String prenomETU) {
		this.prenomETU = prenomETU;
	}

	public String getAdresseETU() {
		return adresseETU;
	}

	public void setAdresseETU(String adresseETU) {
		this.adresseETU = adresseETU;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

}
