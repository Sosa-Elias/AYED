package tp2.ejercicio1;
import java.util.*;
public class ContadorArbol {
// 1. EL MÉTODO PRINCIPAL (El que llama el usuario)
    public ArrayList<Integer> recorrer(BinaryTree<Integer> arbol) {
        // Creamos LA ÚNICA lista que va a existir en todo el proceso
        ArrayList<Integer> numerosPares = new ArrayList<>();
        
        // Llamamos al método que hace el trabajo sucio y le pasamos la lista vacía
        if (arbol != null && !arbol.isEmpty()) { 
            guardarInOrden(arbol, numerosPares);
        }
        
        return numerosPares;
    }

    // 2. EL MÉTODO AUXILIAR PRIVADO (El que viaja por el árbol)
    private void guardarInOrden(BinaryTree<Integer> arbol, ArrayList<Integer> listaCompartida) {
        // Recorremos el hijo izquierdo pasándole la MISMA lista
        if (arbol.hasLeftChild()) {
            guardarInOrden(arbol.getLeftChild(), listaCompartida);
        }
        
        // Si el dato es par, lo agregamos directo a la lista compartida
        if (arbol.getData() % 2 == 0) {
            listaCompartida.add(arbol.getData());
        }
        
        // Recorremos el hijo derecho pasándole la MISMA lista
        if (arbol.hasRightChild()) {
            guardarInOrden(arbol.getRightChild(), listaCompartida);
        }
    }

    private void guardarPostOrden(BinaryTree<Integer> arbol, ArrayList<Integer> listaCompartida){
        if (arbol.hasLeftChild()) {
            guardarPostOrden(arbol.getLeftChild(), listaCompartida);
        }
        if (arbol.hasRightChild()) {
            guardarPostOrden(arbol.getRightChild(), listaCompartida);
        }
        // Si el dato es par, lo agregamos directo a la lista compartida
        if (arbol.getData() % 2 == 0) {
            listaCompartida.add(arbol.getData());
        }

        // Recorremos el hijo derecho pasándole la MISMA lista
    }
    public ArrayList<Integer> recorrerP(BinaryTree<Integer> arbol) {
        // Creamos LA ÚNICA lista que va a existir en todo el proceso
        ArrayList<Integer> numerosPares = new ArrayList<>();
        
        // Llamamos al método que hace el trabajo sucio y le pasamos la lista vacía
        if (arbol != null && !arbol.isEmpty()) { 
            guardarPostOrden(arbol, numerosPares);
        }
        
        return numerosPares;
    }
    public void main(String [] args) {
        BinaryTree<Integer> a = new BinaryTree<>(60);
        BinaryTree<Integer> hijo = new BinaryTree<Integer>(4);
        BinaryTree<Integer> hijo2 = new BinaryTree<Integer>(55);
        for(int i= 0; i<3; i++){
         a.addLeftChild(hijo);
         a.addRightChild(hijo2);}
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista = recorrer(a);
        System.out.print(lista);
        lista2 = recorrerP(a);
        System.out.print(lista2);
    }
    }

