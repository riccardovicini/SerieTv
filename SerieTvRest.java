package com.vicini.serie.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicini.serie.entities.SerieTv;
import com.vicini.serie.sl.SerieTvService;

@RestController
@RequestMapping("api")
public class SerieTvRest {
	
	@Autowired
	private SerieTvService service;
	
	@GetMapping
	public List<SerieTv> getAll(){
		this.service.initSerie();
		return this.service.getAll();
	}

}
