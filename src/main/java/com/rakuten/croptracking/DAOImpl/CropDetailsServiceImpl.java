package com.rakuten.croptracking.DAOImpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.croptracking.DAO.CropDetailsService;
import com.rakuten.croptracking.models.CropDetails;
import com.rakuten.croptracking.repository.CropDetailsRepostiory;

@Service
public class CropDetailsServiceImpl  implements CropDetailsService{

	@Autowired
	private CropDetailsRepostiory cropDetailsRepostiory;
	
	

	@Override
	public CropDetails update(CropDetails cropDetails) {
		
		return this.cropDetailsRepostiory.save(cropDetails);
	}

	@Override
	public CropDetails getCropDetails(int cropId) {
		
		return this.cropDetailsRepostiory.findById(cropId).get();
	}
	
	/*
	 * @Override public CropDetails getUserCropDetails(Long userid) {
	 * 
	 * return this.cropDetailsRepostiory.getCropByUserId(userid); }
	 */

	@Override
	public Set<CropDetails> getCropDetails() {
		
		return new HashSet<>(this.cropDetailsRepostiory.findAll());
	}

	

	@Override
	public CropDetails add(CropDetails cropDetails) {
		
		return this.cropDetailsRepostiory.save(cropDetails);
	}

	@Override
	public void delete(int cropid) {
		this.cropDetailsRepostiory.deleteById(cropid);
		
	}

}
