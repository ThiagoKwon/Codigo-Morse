package com.code.morse;

public class TreePrinter {


    public static void printTree(Node<String> root, int level) {
        if (root == null) {
            return;
        }


        printTree(root.getRight(), level + 1);


        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------- " + root.getValue());
        } else {
            System.out.println(root.getValue());
        }

        printTree(root.getLeft(), level + 1);
    }

    public static void showTree(Node<String> root) {
        printTree(root, 0);  // Começa da raiz (nível 0)
    }
}

