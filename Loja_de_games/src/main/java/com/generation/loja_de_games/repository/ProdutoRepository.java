package com.generation.loja_de_games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.loja_de_games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
}
