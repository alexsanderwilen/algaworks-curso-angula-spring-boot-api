package com.algaworks.curso.algamoney.api.repository;

import com.algaworks.curso.algamoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
