package com.matheus.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matheus.petshop.domain.Pet;

@Repository

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
