package com.example.serviceimp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Salle;
import com.example.repository.SalleRepository;
import com.example.service.SalleService;


@Service
@Transactional
@Component

public class SalleImp implements SalleService{
	@Autowired
	SalleRepository salleRepository;
	
	@Override
	public void saveSalle(Salle sal) {
		salleRepository.save(sal);
	}
	
	@Override
	public void removeSalle(Long Id){
		salleRepository.deleteById(Id);
	} 
	@Override
	public void updateSalle(Salle sal) {
		salleRepository.save(sal);
	}
	
	@Override
	public List<Salle>ListSalle(){
		return salleRepository.findAll();
	}
	@Override
	public Optional<Salle> findSalle(Long Id) {
		return salleRepository.findById(Id);
	}

}
