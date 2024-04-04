package com.example;

public interface Cryptable {
	public String encrypt(String inpText);
	public String deEncrypt(String inpText);
	public void printAlgorithmName();
	public void printDescription();
}


