package tp1.ejercicio7;
import java.util.*;

public class Capicua {
    public static boolean esCapicua(List<Integer> a){
        int izq = 0;
        int der = a.size() - 1;
        while (izq < der){
            if(!a.get(izq).equals(a.get(der))){
                return false;
            }
            izq++;
            der--;
        }
            
        return true;
    }
    public static void main(String [] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,0,1));
        if(esCapicua(a)){
            System.out.print("Es capicua");
        }
        else{System.out.print("no Es capicua");}


    }
}
