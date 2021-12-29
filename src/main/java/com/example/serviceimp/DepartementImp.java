package com.example.serviceimp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Departement;
import com.example.repository.DepartementRepository;
import com.example.service.DepartementService;

@Service
@Transactional
@Component
public class DepartementImp implements DepartementService{
	@Autowired
	DepartementRepository departementRepository;

	
	@Override
	public Departement saveDepartement(Departement Dep) {
		return departementRepository.save(Dep);
    }
	
	
	@Override
	public  List<Departement>ListDepartement(){
		return departementRepository.findAll();
	}

	
 
	
	@Override
	public Departement updateDepartement(Departement Dep)
	{
		return departementRepository.save(Dep);
	}

	@Override
	public Departement removeDepartement(Long id) {
		departementRepository.deleteById(id);
		return departementRepository.getById(id);
	}


	@Override
	public Optional<Departement> findDepartement(Long Id) {
		return departementRepository.findById(Id);
	}
	}


