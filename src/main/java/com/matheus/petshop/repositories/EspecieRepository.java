package com.matheus.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matheus.petshop.domain.Especie;

@Repository

public interface EspecieRepository extends JpaRepository<Especie, Integer> {

}
