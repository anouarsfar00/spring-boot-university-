package com.example.controller;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Departement;
import com.example.service.DepartementService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping(value="/departement")
@Transactional
public class DepartementController
{
	@Autowired
	private DepartementService departementsService;
	
	
	 @GetMapping (value="/findDepartement/{id}") 
	 public Optional<Departement> findDepartement(@PathVariable Long id)
	 { 
		 return departementsService.findDepartement(id); }
	 
	
	@PostMapping("/addDepartement")
	public String creedepartement(@RequestBody Departement Dep)
	{
		departementsService.saveDepartement(Dep);
		return "Department Created Successfully !";
	}
	
	@PutMapping("/updateDepartement/{id}")
	public String updateDepartement(@PathVariable Long id,@RequestBody Departement dep)
	{
		dep.setCodeDEP(id);
		departementsService.saveDepartement(dep);
		return "Department Updated Successfully !";
	}
	
	@GetMapping("/getAllDepartement" )
	public List<Departement> getAllDepartements()
	{ 
		return departementsService.ListDepartement();
		
	}
	
	@DeleteMapping(value="/delete departement/{id}")
	public String deleteDepartement(@PathVariable String id)
	{
		departementsService.removeDepartement(Long.parseLong(id));
		return "Department Deleted Successfully !";
	}

}
