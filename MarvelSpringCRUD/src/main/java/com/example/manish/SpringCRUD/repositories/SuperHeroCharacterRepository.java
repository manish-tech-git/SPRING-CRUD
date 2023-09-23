package com.example.manish.SpringCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manish.SpringCRUD.models.Characters;


@Repository
public interface SuperHeroCharacterRepository extends JpaRepository<Characters, Integer>{

}
