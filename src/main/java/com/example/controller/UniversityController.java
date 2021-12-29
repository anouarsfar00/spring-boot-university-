package com.example.controller;


import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.University;
import com.example.service.UniversityService;


@RestController
@RequestMapping(value="university")
@Transactional
public class UniversityController
{
	@Autowired
	private UniversityService universitesService;
	
	@PostMapping("/addUniversity")
	public String saveUniversity(@RequestBody University uni)
	{
		universitesService.saveUniversity(uni);
		return "University Created Successfully !";
	}
	
	@PutMapping("/updateUniversity/{id}")
	public String UpdateUniversite(@PathVariable Long id, @RequestBody University uni)
	{
		uni.setCodeUNV(id);
		universitesService.saveUniversity(uni);
		return "University Updated Successfully !";
	}
	
	@GetMapping("/getAllUniversity")
	public Collection<University> getAllUniversite()
	{
		return universitesService.ListUniversity();
	}
	@GetMapping(value = "/findUniversity/{id}")
	public University findUniversity(@PathVariable Long id) {
		return universitesService.getUniversity(id);
	}
	
}
