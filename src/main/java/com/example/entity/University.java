package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "University")
@Proxy(lazy = false)
public class University implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeUNV;
	private String nomUNV;
	private String adresseSite;
	@OneToMany(mappedBy = "university")
	@JsonIgnore
	private List<Departement> departements;

	public Long getCodeUNV() {
		return codeUNV;
	}

	public void setCodeUNV(Long codeUNV) {
		this.codeUNV = codeUNV;
	}

	public String getNomUNV() {
		return nomUNV;
	}

	public void setNomUNV(String nomUNV) {
		this.nomUNV = nomUNV;
	}

	public String getAdresseSite() {
		return adresseSite;
	}

	public void setAdresseSite(String adresseSite) {
		this.adresseSite = adresseSite;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	public University(String nomUNV, String adresseSite) {
		super();
		this.nomUNV = nomUNV;
		this.adresseSite = adresseSite;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "University [codeUNV=" + codeUNV + ", nomUNV=" + nomUNV + ", adresseSite=" + adresseSite
				+ ", departements=" + departements + "]";
	}

	public University(Long codeUNV, String nomUNV, String adresseSite, List<Departement> departements) {
		super();
		this.codeUNV = codeUNV;
		this.nomUNV = nomUNV;
		this.adresseSite = adresseSite;
		this.departements = departements;
	}

}
