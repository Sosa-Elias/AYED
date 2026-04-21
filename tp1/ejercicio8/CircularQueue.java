package tp1.ejercicio8;

public class CircularQueue <T>extends Queue <T>{
    public T shift(){
        if(this.isEmpty()){
            return null;
        }
        T elementoRotado = this.dequeque();
        this.enqueue(elementoRotado);
        return elementoRotado;
    }
    
}
