package com.rakuten.croptracking.DAO;

import java.util.Set;

import com.rakuten.croptracking.models.CropDetails;

public interface CropDetailsService {

	
	public CropDetails add(CropDetails cropDetails);
	
	public CropDetails update(CropDetails cropDetails);
	
	public CropDetails getCropDetails(int cropid);
	
	public Set<CropDetails> getCropDetails();
	//public CropDetails getUserCropDetails(Long userid);

	

	public void delete(int cropid);


}

