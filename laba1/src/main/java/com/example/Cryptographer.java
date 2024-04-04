package com.example;
public class Cryptographer{
	private Cryptable crypto;
	public Cryptographer(Cryptable crypto){
		this.crypto = crypto;
	}

	public String encrypt(String inpString){
		return crypto.encrypt(inpString);
	}

	public String deEncrypt(String inpString){
		return crypto.deEncrypt(inpString);
	}

	public void execute(String inpString){
		String res;
		long startTime = System.currentTimeMillis();
		res = encrypt(inpString);
		long endTime = System.currentTimeMillis();
		crypto.printAlgorithmName();
		crypto.printDescription();
		System.out.println("Время выполнения " + (endTime-startTime));
		System.out.println(res);
	}	
}
