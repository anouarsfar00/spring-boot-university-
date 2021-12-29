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

import com.example.entity.Salle;
import com.example.service.SalleService;

@RestController
@RequestMapping(value = "/salle")
@Transactional
public class SalleController {
	@Autowired
	private SalleService sallesService;

	@PostMapping("/addSalle")
	public String creeSalle(@RequestBody Salle sal) {
		sallesService.saveSalle(sal);
		return "Salle Created Succsefully !";
	}

	@GetMapping("/getAllSalle")
	public List<Salle> getAllSalle() {
		return sallesService.ListSalle();
	}

	@GetMapping(value = "/findSalle/{id}")
	public Optional<Salle> findSalle(@PathVariable(value = "id") String id) {
		return sallesService.findSalle(Long.parseLong(id));
	}

	@PutMapping("/updateSalle/{id}")
	public String UpdateSalle(@PathVariable Long id,@RequestBody Salle sal) {
		sal.setnumS(id);
		sallesService.saveSalle(sal);
		return "Salle Updated Succsefully !";
	}

	@DeleteMapping(value = "/deleteSalle/{id}")
	public String deleteSalle(@PathVariable Long id) {
		sallesService.removeSalle(id);
		return "Salle Deleted Succsefully !";
	}

}
