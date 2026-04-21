package tp1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio2 {
    public static List<Integer> nuevoArreglo(int n) {
        List<Integer> miLista = new ArrayList<>(); 
        for(int i=1;i<=n; i++){
            miLista.add(i*n);
        }
        return miLista;

    }

    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ingrese un numero");
        int numero = s.nextInt();
        List<Integer> resultados = nuevoArreglo(numero);
        System.out.print("los resultados son: " + resultados);
        s.close();
    }
}
