package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Combinada {
    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,
         ArrayList<Integer> lista2){
            ArrayList<Integer> lista = new ArrayList<>();
            if (lista1.isEmpty() && lista2.isEmpty()) {
                return lista;
            }
            else {  llenarRecursivo(lista,0,0, lista1, lista2);}
            return lista;
    }
    public static void llenarRecursivo(ArrayList<Integer> lista, int index1, int index2, ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        if(index1 < lista1.size() && index2 < lista2.size()) { 
            if(lista1.get(index1) <= lista2.get(index2)){ 
                lista.add(lista1.get(index1));
                llenarRecursivo(lista, index1 + 1, index2, lista1, lista2);}
            else{
                    lista.add(lista2.get(index2));
                    llenarRecursivo(lista, index1, index2 + 1, lista1, lista2);
                }
            }
        else if (index1 < lista1.size()) {
            lista.add(lista1.get(index1));
            llenarRecursivo(lista, index1 + 1, index2, lista1, lista2);
        }
        else if (index2 < lista2.size()) {
            lista.add(lista2.get(index2));
            llenarRecursivo(lista, index1 , index2 + 1, lista1, lista2);
        }
        }
             
        
    
    public static void main(String [] args){
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1,2,6,7,8));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(3,4,5,9,10));

        ArrayList<Integer> lista = combinarOrdenado(lista1, lista2);
        System.out.print(lista);

    }
}
    