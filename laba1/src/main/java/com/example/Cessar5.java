package com.example;

public class Cessar5 implements Cryptable{
	public String Encrypt(String inpText){
		StringBuilder outText = new StringBuilder();
		char ch;
		for(int i = 0; i < inpText.length(); i++){
			ch = inpText.charAt(i);
			ch += 5;
			if(ch > 'z'){
				ch -=26;
			}
			outText.append(ch);
		}
		return outText.toString();
	}

	public String DeEncrypt(String inpText) {
		StringBuilder outText = new StringBuilder();
		char ch;
		for(int i = 0; i < inpText.length(); i++){
			ch = inpText.charAt(i);
			ch -= 5;
			if(ch < 'a'){
				ch +=26;
			}
			outText.append(ch);
		}
		return outText.toString();
	}
}
