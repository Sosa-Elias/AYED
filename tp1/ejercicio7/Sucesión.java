package tp1.ejercicio7;
import java.util.*;
public class Sucesión {
    public static void hacerSucesion(int n, List<Integer> lista){
        lista.add(n);
        if(n!=1){
            if(n % 2 == 0){
                hacerSucesion(n/2, lista);
            }
            else {hacerSucesion(n*3+1, lista);}
     }
    }
    public static void main(String [] args ){
        List<Integer> lista = new ArrayList<>();
        hacerSucesion(9, lista);
        System.out.print(lista);
    }
}
