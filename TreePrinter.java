package com.code.morse;

public class TreePrinter {

    // Função auxiliar que imprime a árvore binária em formato de "bolinhas"
    public static void printTree(Node<String> root, int level) {
        if (root == null) {
            return;
        }

        // Imprime a árvore da direita para a esquerda, para que a esquerda fique "para baixo"
        printTree(root.getRight(), level + 1);

        // Imprime os espaços para simular o nível da árvore
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");  // Espaço entre níveis
            }
            System.out.println("|------- " + root.getValue());  // Nó atual
        } else {
            System.out.println(root.getValue());  // Raiz da árvore
        }

        // Imprime o nó da esquerda
        printTree(root.getLeft(), level + 1);
    }

    // Método público para chamar a função de impressão
    public static void showTree(Node<String> root) {
        printTree(root, 0);  // Começa da raiz (nível 0)
    }
}

