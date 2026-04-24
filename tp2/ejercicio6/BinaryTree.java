package tp2.ejercicio6;

import tp1.ejercicio10.*;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
		if(this.isLeaf()){
			return 1;
		}

		int hojas = 0;

		if(this.hasLeftChild()){
			hojas += getLeftChild().contarHojas();
		}

		if (this.hasRightChild()) {
			hojas += getRightChild().contarHojas();
		}


		return hojas;

	}
		
		
    	 
    public BinaryTree<T> espejo(){
		BinaryTree<T> arbolEspejo = new BinaryTree<>(this.getData());
		BinaryTree<T> eIzq = null;
		BinaryTree<T> eDer = null;

		if(this.hasLeftChild()){
			eIzq = this.getLeftChild().espejo();
		}
		if(this.hasRightChild()){
			eDer = this.getRightChild().espejo();
		}
		arbolEspejo.addLeftChild(eDer);
		arbolEspejo.addRightChild(eIzq);

 	   return arbolEspejo;
    }
	public void recorridoPorNiveles() {
		Queue<BinaryTree<T>> cola = new Queue<>();
		
		cola.enqueue(this);
		
		while (!cola.isEmpty()) {
			BinaryTree<T> nodo = cola.dequeue();

			System.out.print(nodo.getData() + " ");
			
			if (nodo.hasLeftChild()) {
				cola.enqueue(nodo.getLeftChild());
			}
			if (nodo.hasRightChild()) {
				cola.enqueue(nodo.getRightChild());
			}	
		}
	}
	// 0<=n<=m
	public void entreNiveles(int n, int m){
		Queue<BinaryTree<T>> cola = new Queue<>();
		int cantidad;
		int nivel = 0;
		cola.enqueue(this);

		while (!cola.isEmpty()) {
			if (nivel > m) {
				break;
			}
			cantidad = cola.size();
            for (int i = 0; i < cantidad; i++) {
                BinaryTree<T> nodo = cola.dequeue();
                if (nivel >= n) {
                    System.out.print(nodo.getData() + " ");
                }
                if (nodo.hasLeftChild()) {
                    cola.enqueue(nodo.getLeftChild());
                }

                if (nodo.hasRightChild()) {
                    cola.enqueue(nodo.getRightChild());
                }
            }
            nivel++; 
			
		}
   }
		
}

