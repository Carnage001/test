package com.rakuten.croptracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.croptracking.DAO.CropDetailsService;
import com.rakuten.croptracking.models.CropDetails;


@RestController
@RequestMapping("/crop")
@CrossOrigin("*")
public class CropDetailsController {
	
	@Autowired
	private CropDetailsService service;
	
	@PostMapping("/addcrop/{id}")
	public ResponseEntity<CropDetails> add(@PathVariable(value = "id") Long id,@RequestBody CropDetails cropDetails)
	{
		return ResponseEntity.ok(this.service.add(cropDetails));
	}
	
	@PutMapping("/")
	public ResponseEntity<CropDetails> update(@RequestBody CropDetails cropDetails)
	{
		return ResponseEntity.ok(this.service.update(cropDetails));
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name="id") int fieldid) {
		this.service.delete(fieldid);
	}
	
	//get cropdetails
	
	@GetMapping("/getallcrops")
	public ResponseEntity<?> CropDetails(){
		return ResponseEntity.ok(this.service.getCropDetails());
	}
	
	/*
	 * // @GetMapping("/getusercrops/{userid}") // public ResponseEntity<?>
	 * UserCropDetails(@PathVariable(name="userid") Long userid) // { // return
	 * ResponseEntity.ok(this.service.getUserCropDetails(userid)); // }
	 */	

	@GetMapping("{cropid}")
	public CropDetails cropDetails(@PathVariable("cropid") int cropid) {
		return this.service.getCropDetails(cropid);
	}
	
	
	
}
