package com.rakuten.croptracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rakuten.croptracking.models.CropDetails;
import com.rakuten.croptracking.models.User;



public interface CropDetailsRepostiory extends JpaRepository<CropDetails, Integer> {
	
	/*
	 * @Query("SELECT u FROM CropDetails u WHERE u.user_id = :userid") public
	 * CropDetails getCropByUserId(@Param("userid") Long userid);
	 */
}
