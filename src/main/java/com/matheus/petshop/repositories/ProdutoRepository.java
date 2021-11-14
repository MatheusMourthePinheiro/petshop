package com.matheus.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.matheus.petshop.domain.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
