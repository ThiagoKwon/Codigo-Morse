package com.code.morse;

public class Main {

	public static void main(String[] args) {

		Tree arv = new Tree();
		String[] alfabeto = { "E", "T", "I", "A", "N", "M", "S", "U", "R", "W", "D", "K", "G", "O", "H", "V", "F", "L",
				"P", "J", "B", "X", "C", "Y", "Z", "Q" };
		String[] morse = { ".", "-", "..", ".-", "-.", "--", "...", "..-", ".-.", ".--", "-..", "-.-", "--.", "---",
				"....", "...-", "..-.", ".-..", ".--.", ".---", "-...", "-..-", "-.-.", "-.--", "--..", "--.-" };

		for (int i = 0; i < alfabeto.length; i++) {
			arv.add(alfabeto[i], morse[i]);
		}

		System.out.println(arv.searchWord("- .... .. .- --. ---"));
		TreePrinter.showTree(arv.getRoot());
	}

}
//-... .-. . -. --- (Breno)
//.--. . -.. .-. --- (Pedro)
//- .... .. .- --. --- (Thiago)