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

import com.rakuten.croptracking.DAO.PesticideService;
import com.rakuten.croptracking.models.Pesticide;


@RestController
@CrossOrigin("*")
@RequestMapping("/pesticide")
public class PesticideController {

	@Autowired
	private PesticideService pesticideService;
	
	@PostMapping("/addpec/{id}")
	public ResponseEntity<Pesticide> add(@PathVariable("id") int id, @RequestBody Pesticide pesticide)
	{
		return ResponseEntity.ok(this.pesticideService.add(pesticide));
	}
	
	@PutMapping("/")
	public ResponseEntity<Pesticide> update(@RequestBody Pesticide pesticide)
	{
		return ResponseEntity.ok(this.pesticideService.update(pesticide));
	}
	
	@GetMapping("/")
	public ResponseEntity<?> Pesticide()
	{
		return ResponseEntity.ok(this.pesticideService.getPesticide());
	}
	
	@GetMapping("{pid}")
	public Pesticide pesticide(@PathVariable("pid") Long pid) {
		return this.pesticideService.getPesticide(pid);
	}
	
	@DeleteMapping("delete/{pid}")
	public void delete(@PathVariable (name="pid") Long pid) {
		this.pesticideService.delete(pid);
	}
	
	
	
	
	
	
}
