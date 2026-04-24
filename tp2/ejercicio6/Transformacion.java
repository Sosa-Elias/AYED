package tp2.ejercicio6;

public class Transformacion {
    private BinaryTree<Integer> arbol;

    public Transformacion(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public Transformacion() {

    }
    public int sumaA(BinaryTree<Integer> arbol) {
        int izq = 0;
        int der = 0;
        if(arbol.hasLeftChild()){
            izq += sumaA(arbol.getLeftChild());
        }
        if(arbol.hasRightChild()){
            der+= sumaA(arbol.getRightChild());
        }
        int valor = arbol.getData() + izq + der;
        arbol.setData(izq + der);
        return valor;
    }

    public BinaryTree<Integer> suma(){
        sumaA(this.arbol);
        return this.arbol;
    }
}
