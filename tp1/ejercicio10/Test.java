package tp1.ejercicio10;
import java.util.*;


public class Test {
    public static void main(String [] args) {
    Scanner s = new Scanner(System.in);
    DoubleEndedQueue<Persona> banco = new DoubleEndedQueue<>();
    String nombre; 
    boolean prioridad;

    for(int i= 0; i<2; i++) {
        System.out.print("lea nombre: ");
        nombre = s.next();
        System.out.print("lea prioridad: ");
        prioridad = s.nextBoolean();
        if (prioridad){banco.enqueueFirst(new Persona(nombre, prioridad));}
        else{banco.enqueue(new Persona(nombre, prioridad));}
    }
        
    while(!banco.isEmpty()){
    System.out.println(banco.dequeue().toString());
}
s.close();
}}