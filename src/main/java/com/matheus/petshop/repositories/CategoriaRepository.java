package com.matheus.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matheus.petshop.domain.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
