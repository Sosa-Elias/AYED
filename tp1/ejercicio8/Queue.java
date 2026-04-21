package tp1.ejercicio8;
import java.util.*;


public class Queue<T> {
    protected List<T> data;
    public Queue() {
        this.data = new LinkedList<T>(); 
    }
    public void enqueue(T data){
        this.data.add(data);    

    }
    public T dequeque(){
        return data.remove(0);

    }

    public T head() {
        return data.get(0);
    }
     public boolean isEmpty(){
        return this.data.isEmpty();
     }
     public int size(){
        return this.data.size();

     }
     public String toString(){
        return this.data.toString();
     }
}