package com.rakuten.croptracking.Exception;

public class UserFoundException extends Exception {


	public UserFoundException()
	{
		super("User with this username is already present in database");
	}
	
	public UserFoundException(String msg)
	{
		super(msg);
	}
}
