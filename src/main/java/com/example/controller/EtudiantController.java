package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Etudiant;
import com.example.service.EtudiantService;

@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantController {
	@Autowired
	private EtudiantService etudiantsService;

	@GetMapping(value = "/findEtudiant/{id}")
	public Optional<Etudiant> findEtudiant(@PathVariable(value = "id") String id) {
		return etudiantsService.findEtudiant(Long.parseLong(id));
	}

	@PostMapping("/addEtudiant")
	public String creeEtudiant(@RequestBody Etudiant etu) {
		etudiantsService.saveEtudiant(etu);
		return "Student Created Successfully !";	}

	@PutMapping("/updateEtudiant")
	public String UpdateEtudiant(@PathVariable @RequestBody Etudiant etu) {
		etudiantsService.saveEtudiant(etu);
		return "Student Updated Successfully !";
	}

	@GetMapping("/getAllEtudiant")
	public List<Etudiant> getAllEtudiant() {
		return etudiantsService.ListEtudiant();
	}

	@DeleteMapping(value = "/deleteEtudiant/{id}")
	public String deleteEtudiant(@PathVariable String id) {
		etudiantsService.removeEtudiant(Long.parseLong(id));
		return "Student Deleted Successfully";
	}

}
