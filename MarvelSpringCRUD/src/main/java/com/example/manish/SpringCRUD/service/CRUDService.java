package com.example.manish.SpringCRUD.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manish.SpringCRUD.models.Characters;
import com.example.manish.SpringCRUD.repositories.SuperHeroCharacterRepository;

@Service
public class CRUDService {
	
	@Autowired 
	SuperHeroCharacterRepository superHeroCharacterRepository;
	
	public void createSuperHero(Characters character) {
		// TODO Auto-generated method stub

		superHeroCharacterRepository.save(character);
	}
	
	


	public Characters readSuperHeroById(int val) {
		
		return superHeroCharacterRepository.findById(val).get();
		
	}


	public void updateSuperHeroHumanName(Characters superhero, int id) {
		
		Characters superheroToBeUpdated = readSuperHeroById(id);
		
		superheroToBeUpdated.setHumanName(superhero.getHumanName());
		
		superHeroCharacterRepository.save(superheroToBeUpdated);
		
	}




	public void deleteSuperHero(int id) {
		// TODO Auto-generated method stub
		superHeroCharacterRepository.deleteById(id);
	}

}
