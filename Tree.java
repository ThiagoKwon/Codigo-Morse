package com.code.morse;

public class Tree {
	private Node<String> root = new Node<String>("começo");
	private String result = "PALAVRA: ";

	public Node<String> getRoot() {
		return root;
	}

	public void add(String value, String instruc) {
		Node<String> newNode = new Node<String>(value);

		Node<String> current = this.root;

		for (int i = 0; i < instruc.length(); i++) {
			String carac = String.valueOf(instruc.charAt(i));
			if (carac.equals(".")) {
				if (i == instruc.length() - 1 && current.getLeft() == null) {
					current.setLeft(newNode);
				} else {
					current = current.getLeft();
				}
			} else if (carac.equals("-")) {
				if (i == instruc.length() - 1 && current.getRight() == null) {
					current.setRight(newNode);
				} else {
					current = current.getRight();
				}
			}
		}
	}

	public String searchWord(String instruc) {
		Node<String> current = this.root;
		instruc = instruc + " ";

		for (int i = 0; i < instruc.length(); i++) {
			String carac = String.valueOf(instruc.charAt(i));
			if (carac.equals(".")) {
				current = current.getLeft();
			} else if (carac.equals("-")) {
				current = current.getRight();
			} else {
				setResult(getResult() + current.getValue());
				current = this.root;
			}
		}
		return getResult();
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
