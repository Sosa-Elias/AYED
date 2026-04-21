package tp1.ejercicio10;
import java.util.*;
public class Queue<T> {
    private LinkedList<T> data;

    public Queue() {
        data = new LinkedList<T>();
    }
    
    public void enqueue(T dato) {
        data.add(dato);
    }
    
    public T dequeue() {
        return data.removeFirst();
    }

    public T head() {
        return data.get(0);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
    
    public int size() {
        return data.size();
    }

    public String toString() {
        String texto = "";
        for (int i = 0; i < data.size(); i++) {
            texto += " " + data.get(i);
        }
        return texto;
    }
}
