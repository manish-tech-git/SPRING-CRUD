package com.example.manish.SpringCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.manish.SpringCRUD.models.Characters;
import com.example.manish.SpringCRUD.service.CRUDService;

@RestController
public class MarvelCRUDController {
	
	//CRUD 
	@Autowired
	CRUDService crudService;
	//Create API endpoint - POST
	
	@PostMapping(path = "create")
	public void createSuperHero( @RequestBody Characters superhero) {
		
		crudService.createSuperHero(superhero);

	}
	
	
	//for fetching information
	@GetMapping("read")
	public Characters readSuperHeroById  ( @RequestParam (name = "id") int val) {
	
			//MarvelCRUDController crudService;
			return crudService.readSuperHeroById(val);
	}
	
	//for updation
	@PutMapping("update")
	public void updateSuperGeroHumanName(@RequestBody Characters superhero, @RequestParam(name = "id") int id) {
		
		crudService.updateSuperHeroHumanName(superhero, id);	

	}
	
	
	
	//for deleteing Mapping
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name = "id") int id) {
		
		crudService.deleteSuperHero(id);
		
		
	}
	
	

}
