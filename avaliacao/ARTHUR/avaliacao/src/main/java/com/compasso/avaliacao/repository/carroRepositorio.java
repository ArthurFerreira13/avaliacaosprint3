package com.compasso.avaliacao.repository;

import java.util.List;
import com.compasso.avaliacao.model.carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface carroRepositorio extends JpaRepository<carro, Long>{
	
	


	List<carro> findBychassi(String chassi);
	List<carro> findBynome(String nome);
	List<carro> findByvalor(double valor);
	List<carro> findByano(double ano);
	List<carro> findBymodelo(String modelo);
	
     @Query
	 List<carro> findByOrderByNomeAsc();
	 @Query
     List<carro> findByOrderByNomeDesc();
     @Query
     List<carro> findByOrderByValorAsc();
     @Query
     List<carro> findByOrderByValorDesc();
	}


