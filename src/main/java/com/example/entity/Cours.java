package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cours")
public class Cours implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeC;
	private String libelleC;

	@OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Enseignant> listEnseignants;

	@OneToOne(cascade = CascadeType.ALL)
	private Salle salleName;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Seance", joinColumns = @JoinColumn, inverseJoinColumns = @JoinColumn)
	private List<Etudiant> listEtu;
	
	public Long getCodeC() {
		return codeC;
	}

	public void setCodeC(Long codeC) {
		this.codeC = codeC;
	}

	public String getLibelleC() {
		return libelleC;
	}

	public void setLibelleC(String libelleC) {
		this.libelleC = libelleC;
	}

	public List<Enseignant> getlistEnseignants() {
		return listEnseignants;
	}

	public void setlistEnseignants(List<Enseignant> listEnseignants) {
		this.listEnseignants = listEnseignants;
	}

	public Salle getSalleName() {
		return salleName;
	}

	public void setSalleName(Salle salleName) {
		this.salleName = salleName;
	}

	public List<Etudiant> getlistEtudiants() {
		return listEtu;
	}

	public void setlistEtudiants(List<Etudiant> list) {
		listEtu = list;
	}

}
