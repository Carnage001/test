package com.rakuten.croptracking.DAOImpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.croptracking.DAO.PesticideService;
import com.rakuten.croptracking.models.Pesticide;
import com.rakuten.croptracking.repository.PesticideRepository;

@Service
public class PesticideServiceImpl implements PesticideService {

	@Autowired
	private PesticideRepository pesticideRepository;
	@Override
	public Pesticide add(Pesticide pesticide) {
		
		return this.pesticideRepository.save(pesticide);
	}

	@Override
	public Pesticide update(Pesticide pesticide) {
		
		return this.pesticideRepository.save(pesticide);
	}

	@Override
	public Pesticide getPesticide(Long pid) {
		
		return this.pesticideRepository.findById(pid).get();
	}

	@Override
	public Set<Pesticide> getPesticide() {
		
		return new HashSet<>(this.pesticideRepository.findAll());
	}

	@Override
	public void delete(Long pid) {
		this.pesticideRepository.deleteById(pid);
		
	}

}
