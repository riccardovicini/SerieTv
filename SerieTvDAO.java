package com.vicini.serie.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicini.serie.entities.SerieTv;

@Repository
public interface SerieTvDAO extends JpaRepository<SerieTv, Integer> {
	
	SerieTv findByTitolo(String titolo);
	List<SerieTv> findByGenere(String genere);
	
}
