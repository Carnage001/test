package com.rakuten.croptracking.Exception;

public class UserNotFoundException extends Exception{

	public UserNotFoundException()
	{
		super("User is not present in database");
	}
	
	public UserNotFoundException(String msg)
	{
		super(msg);
	}
	
}
