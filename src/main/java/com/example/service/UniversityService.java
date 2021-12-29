package com.example.service;

import java.util.List;

import com.example.entity.University;


public interface UniversityService {
	University getUniversity(Long id);
	University saveUniversity(University uni);
	University updateUniversity(University uni);
	 List<University>ListUniversity();
}
