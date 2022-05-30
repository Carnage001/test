package com.rakuten.croptracking.models;

public class JwtResponse {

	
	public JwtResponse() {
		
	}

	String token;

	public JwtResponse(String token) {
		
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
