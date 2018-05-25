package com.faithConstructorInserte;

public class TextEditer {
	private SpellChecker spellChecker;
	
	public TextEditer(SpellChecker sc) {
		System.out.println("TextEditor constructor");
		this.spellChecker = sc;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
