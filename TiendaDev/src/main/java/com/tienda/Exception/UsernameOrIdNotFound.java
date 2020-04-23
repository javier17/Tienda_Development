package com.tienda.Exception;

public class UsernameOrIdNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2414279779080507523L;

	public UsernameOrIdNotFound() {
		super("Usuario o Id no encontrado");
	}
	
	public UsernameOrIdNotFound(String message) {
		super(message);
	}
	
	
}
