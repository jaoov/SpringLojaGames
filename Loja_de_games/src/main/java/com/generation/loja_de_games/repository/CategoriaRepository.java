package com.generation.loja_de_games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.loja_de_games.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>
{
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
