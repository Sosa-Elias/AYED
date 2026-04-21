package tp1.ejercicio8;

public class DoubleEndedQueue<T> extends Queue<T> {
       public void enqueueFirst(T dato) {
        enqueue(dato);
        for (int i = 0; i < size()-1; i++) {
            T aux = dequeque();
            enqueue(aux);
        }
    }

    }
    

