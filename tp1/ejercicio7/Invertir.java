package tp1.ejercicio7;
import java.util.*;
public class Invertir {
    public static void invertir(List<Integer> lista){
        int n;
        if (!lista.isEmpty()){
            n = lista.get(0);
            lista.remove(0);
            invertir(lista);
            lista.add(n);
        }
    }
    public static void main(String [] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.print("Lista Original:" + lista + "\n");
        invertir(lista);
        System.out.print("Lista Invertida:" + lista + "\n");

    }
}
