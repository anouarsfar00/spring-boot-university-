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

import com.example.entity.Cours;
import com.example.service.CourService;

@RestController
@RequestMapping(value="/cours")
@Transactional
public class CoursController
{
	@Autowired
	private CourService coursService;
	
	@GetMapping(value="/findCours/{id}")
	public Optional<Cours> findCours(@PathVariable (value="id") String id){
		return coursService.findCours(Long.parseLong(id));
	}
	
	@PostMapping("/addCours")
	public String creeCours(@RequestBody Cours co)
	{
		coursService.saveCours(co);
		return "Cours Created Successfully !";
	}
	
	@PutMapping("/updateCours/{id}")
	public String UpdateCours(@PathVariable Long id, @RequestBody Cours co)
	{
		co.setCodeC(id);
		coursService.saveCours(co);
	return"Cours Updated Successfully !";
	}
	
	@GetMapping("/getAllCours")
	public List<Cours> getAllCours(){
		return coursService.ListCours();
	}
	
	@DeleteMapping(value="/deleteCours/{id}")
	public String deleteCours(@PathVariable Long id)
	{
		coursService.removeCours(id);
		return "Cours Deleted Successfully !";
	}

}
