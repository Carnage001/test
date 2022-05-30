package com.rakuten.croptracking.DAO;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.rakuten.croptracking.models.Pesticide;


@Service
public interface PesticideService {

	
	public Pesticide add(Pesticide pesticide);
	
	public Pesticide update(Pesticide pesticide);
	
	public Pesticide getPesticide(Long pid);
	
	public Set<Pesticide> getPesticide();
	
	public void delete(Long pid);
}
