package tp2.ejercicio6;

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
        
        System.out.print("Árbol origal: " + "\n");
        imprimirPreorden(arbol);
        
        Transformacion t = new Transformacion(arbol);
        t.suma();

        // Mostrar después
        System.out.println("\nÁrbol transformado:");
        imprimirPreorden(arbol);
    }

    public static void imprimirPreorden(BinaryTree<Integer> arbol) {
        if (arbol == null) return;

        System.out.print(arbol.getData() + " ");

        if (arbol.hasLeftChild()) {
            imprimirPreorden(arbol.getLeftChild());
        }
        if (arbol.hasRightChild()) {
            imprimirPreorden(arbol.getRightChild());
        }
    }
}
