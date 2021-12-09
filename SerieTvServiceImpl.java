package com.vicini.serie.sl;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicini.serie.dal.SerieTvDAO;
import com.vicini.serie.entities.SerieTv;

@Service
public class SerieTvServiceImpl implements SerieTvService {

	@Autowired
	private SerieTvDAO repo;
	private List<SerieTv> serie;
	
	@Override
	public void addSerie(SerieTv s) {
		this.repo.save(s);
	}

	@Override
	public SerieTv getSerie(int id) {
		return this.repo.getById(id);
	}

	@Override
	public SerieTv getSerieByName(String titolo) {
		return this.repo.findByTitolo(titolo);
	}

	@Override
	public List<SerieTv> getAll() {
		return this.repo.findAll();
	}

	@Override
	public List<SerieTv> getByGenere(String genere) {
		return this.repo.findByGenere(genere);
	}

	@Override
	public void initSerie() {
		if (this.serie == null || this.serie.isEmpty() )
			this.serie = this. getAll();
	}
	

}
