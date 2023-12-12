package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import com.generation.blogpessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{ //<Tema, Long> Classe model que irá integir e o tipo da PK

	List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao")String descricao);
	
	//SELECT * FROM tb_temass WHERE descricao LIKE "%descricao%";
}
