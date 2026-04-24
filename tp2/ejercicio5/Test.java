package tp2.ejercicio5;

import tp2.ejercicio6.BinaryTree;

public class Test {
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<>(9);
        BinaryTree<Integer> izq = new BinaryTree<>(11);
        BinaryTree<Integer> der = new BinaryTree<>(7);

        arbol.addLeftChild(izq);
        arbol.addRightChild(der);
        izq.addLeftChild(new BinaryTree<>(1));
        izq.addRightChild(new BinaryTree<>(6));
        der.addLeftChild(new BinaryTree<>(8));
        der.addRightChild(new BinaryTree<>(4));

        ProfundidadDeArbol p = new ProfundidadDeArbol(arbol);

        System.out.print("Nivel 0: " + p.sumarElementosProfundidas(0) + "\n");
        System.out.print("Nivel 1: " + p.sumarElementosProfundidas(1) + "\n");
        System.out.print("Nivel 2: " + p.sumarElementosProfundidas(2) + "\n");
    }
    
}
