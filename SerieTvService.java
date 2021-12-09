package com.vicini.serie.sl;

import java.util.List;

import com.vicini.serie.entities.SerieTv;

public interface SerieTvService {
	
	void addSerie(SerieTv p);
	SerieTv getSerie(int id);
	SerieTv getSerieByName(String titolo);
	List<SerieTv> getAll();
	List<SerieTv> getByGenere(String genere);
	void initSerie();

}
