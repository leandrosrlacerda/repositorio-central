package com.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algamoney.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
