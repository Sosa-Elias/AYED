package tp2.ejercicio5;

import tp1.ejercicio10.Queue;
import tp2.ejercicio6.BinaryTree;

class ProfundidadDeArbol {
    private BinaryTree<Integer> arbol;

    public int sumarElementosProfundidas(int p){
        Queue<BinaryTree<Integer>> cola = new Queue<>(); 
        int nivel = 0;
        int cantidad;
        int resultado = 0;
        cola.enqueue(this.arbol);

        while (!cola.isEmpty()) {
            if (nivel > p) {
                break;
            }
            cantidad = cola.size();
            for (int i = 0; i < cantidad; i++) {
                BinaryTree<Integer> nodo = cola.dequeue();
                if (nivel == p) {
                    resultado += nodo.getData();
                }
                else {
                    if (nodo.hasLeftChild()) {
                        cola.enqueue(nodo.getLeftChild());
                    }

                    if (nodo.hasRightChild()) {
                        cola.enqueue(nodo.getRightChild());
                    }
                }
            }
            nivel++;
        }
        return resultado;
    }
    public ProfundidadDeArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
}