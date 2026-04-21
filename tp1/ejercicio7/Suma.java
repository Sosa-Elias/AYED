package tp1.ejercicio7;
import java.util.*;
public class Suma {
    public static int sumarLinked(LinkedList<Integer> lista){
        return suma(lista, 0);
    }
    public static int suma(LinkedList<Integer> lista, int i){
        if(i == lista.size() ){
             return 0;
        }
        return lista.get(i) + suma(lista, i + 1);
    }
    public static void main(String [] args ){
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1,2,3,4));
        int total = sumarLinked(lista);
        System.out.print(total);
    }
}
