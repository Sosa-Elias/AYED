package tp1.ejercicio5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {

    public static Objret conRetorno(List<Integer> enteros) {
        Objret ob = new Objret();
        ob.setMinimo(99);
        ob.setMaximo(-99);
        int i = 0;
        int total = 0;
        for(int aj: enteros){
            if (aj < ob.getMinimo())
                ob.setMinimo(aj);
            if (aj > ob.getMaximo())
                ob.setMaximo(aj);
            i++;
            total += aj;
            }
        ob.setPromedio(total / i);


        return ob;

    }
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>(Arrays.asList(-10,23,12,8,7));
        Objret ob = conRetorno(enteros);
        System.out.println("El maximo es: " + ob.getMaximo());
        System.out.println("El minimo es: " + ob.getMinimo());
        System.out.println("El promedio es: " + ob.getPromedio());
    }

}
