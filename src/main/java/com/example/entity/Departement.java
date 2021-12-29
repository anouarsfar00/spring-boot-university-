package com.example.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departement")
public class Departement implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeDEP;
	private String nomDEP;
	@ManyToOne
	@JsonIgnore
	private University university;
	@OneToMany(mappedBy = "departementEns", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Enseignant> enseignants;

	public Long getCodeDEP() {
		return codeDEP;
	}

	public void setCodeDEP(Long codeDEP) {
		this.codeDEP = codeDEP;
	}

	public String getNomDEP() {
		return nomDEP;
	}

	public void setNomDEP(String nomDEP) {
		this.nomDEP = nomDEP;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Collection<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public Departement(Long codeDEP, String nomDEP, University universite) {
		super();
		this.codeDEP = codeDEP;
		this.nomDEP = nomDEP;
		this.university = universite;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Departement [codeDEP=" + codeDEP + ", nomDEP=" + nomDEP + ", university=" + university
				+ ", enseignants=" + enseignants + "]";
	}
}
