package tp1.ejercicio7;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TestArrayList {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> arreglo = new ArrayList<>();
        System.out.print("Ingrese numeros hasta que sea 0:");
        int numero = s.nextInt();
        while(numero != 0){
            arreglo.add(numero);
            numero = s.nextInt();

        }
        System.out.print("NUMEROS DEL ARREGLO: ");
        for (int  ent: arreglo){
            System.out.print(ent + " - " );
        }
        s.close();
    }
// 7.b linked list utiliza mas recursos de que arraylisy
//7.c un for tradicional

    
}
