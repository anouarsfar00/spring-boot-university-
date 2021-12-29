package com.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "salle")
@JsonIgnoreType
public class Salle implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numS;
	private String nomS;
	private Long capacite;
	@OneToOne(mappedBy = "salleName")
	private Cours cours_Salle;

	public Salle() {

	}

	public Salle(String nomS) {
		this.nomS = nomS;
	}

	public Long getnumS() {
		return numS;
	}

	public void setnumS(Long numS) {
		this.numS = numS;
	}

	public String getNomS() {
		return nomS;
	}

	public void setNomS(String nomS) {
		this.nomS = nomS;
	}

	public Long getCapacite() {
		return capacite;
	}

	public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}

}
