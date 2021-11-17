package com.matheus.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matheus.petshop.domain.Estado;

@Repository

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
