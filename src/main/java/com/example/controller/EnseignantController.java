package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Enseignant;
import com.example.service.EnseignantService;

@RestController
@RequestMapping(value = "/enseignant")
@Transactional
public class EnseignantController {
	@Autowired
	private EnseignantService enseignantsService;

	@GetMapping(value = "/findEnseignant/{id}")
	public Optional<Enseignant> findEnseignant(@PathVariable(value = "id") String id) {
		return enseignantsService.findEnseignant(Long.parseLong(id));
	}

	@PostMapping("/addEnseignant")
	public String addEnseignant(@RequestBody Enseignant en) {
		enseignantsService.saveEnseignant(en);
		return "Professor Created successfully !";
	}

	@PutMapping("/updateEnseignant/{id}")
	public String updateEnseignant(@PathVariable Long id, @RequestBody Enseignant en) {
		en.setMatricule(id);
		enseignantsService.saveEnseignant(en);
		return "Professor Updated successfully !";

	}

	@GetMapping("/getAllEnseignant")
	public List<Enseignant> getAllEnseignant() {
		return enseignantsService.ListEnseignant();
	}

	@DeleteMapping(value = "/deleteEnseignant/{id}")
	public String deleteEnseignant(@PathVariable String id) {
		enseignantsService.removeEnseignant(Long.parseLong(id));
		return "Professor Deleted successfully !";
	}

}
