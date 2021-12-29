package com.example.serviceimp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Etudiant;
import com.example.repository.EtudiantRepository;
import com.example.service.EtudiantService;

@Service
@Transactional
@Component
public class EtudiantImp implements EtudiantService{

	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Override
	public List<Etudiant>ListEtudiant(){
		return etudiantRepository.findAll();
	}
	
	@Override
    public void saveEtudiant (Etudiant c) {
		etudiantRepository.save(c);
    }
	
	@Override
	public void removeEtudiant(Long id) {
		etudiantRepository.deleteById(id);
	}
	@Override
	public void updateEtudiant (Etudiant c)
	{
	etudiantRepository.save(c);
	}
	@Override
	public Optional<Etudiant> findEtudiant(Long Id) {
		return etudiantRepository.findById(Id);
	}
}
