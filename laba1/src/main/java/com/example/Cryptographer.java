package com.example;
public class Cryptographer{
	private Cryptable crypto;
	public Cryptographer(Cryptable crypto){
		this.crypto = crypto;
	}

	public String Encrypt(String inpString){
		return crypto.Encrypt(inpString);
	}

	public String DeEncrypt(String inpString){
		return crypto.DeEncrypt(inpString);
	}
}
