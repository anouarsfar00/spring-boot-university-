package com.example.serviceimp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Cours;
import com.example.repository.CoursRepository;
import com.example.service.CourService;
@Component
@Service
@Transactional
public class CoursImp implements CourService {
@Autowired
CoursRepository coursRepository;
	@Override
	public void saveCours(Cours c) {
		coursRepository.save(c);		
	}

	@Override
	public void updateCours(Cours c) {
		coursRepository.save(c);
	}

	@Override
	public List<Cours> ListCours() {
	
		return coursRepository.findAll();
	}

	@Override
	public void removeCours(Long Id) {
		coursRepository.deleteById(Id);
	}

	@Override
	public Optional<Cours> findCours(Long Id) {
		
		return coursRepository.findById(Id);
	}

}
