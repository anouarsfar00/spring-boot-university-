package com.example.serviceimp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.University;
import com.example.repository.UniversiteRepository;
import com.example.service.UniversityService;

@Service
@Transactional
@Component

public class UniversityImp implements UniversityService {
	@Autowired
	UniversiteRepository universityRepository;

	@Override
	public University saveUniversity(University uni) {
		return universityRepository.save(uni);
	}

	@Override
	public University updateUniversity(University uni) {
		return universityRepository.save(uni);
	}

	@Override
	public List<University> ListUniversity() {
		return universityRepository.findAll();
	}

	@Override
	public University getUniversity(Long id) {
		return universityRepository.getById(id);
	}

}
