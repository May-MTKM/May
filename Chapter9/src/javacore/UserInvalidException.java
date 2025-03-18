package javacore;

public class UserInvalidException extends Exception{

	String msg;
	public UserInvalidException(String msg) {
		this.msg = msg;
	}
}
