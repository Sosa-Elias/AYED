package tp1.ejercicio9;
import java.util.*;
public class Ejercicio9 {
    public static boolean esBalanceado(String s){
        Stack<Character> pila = new Stack<>();
        for(int i=0; i < s.length(); i++){
            char actual = s.charAt(i);
            switch (actual ) {
                case '{': case '[': case '(':
                    pila.push(actual);
                    break;
            
                case '}': case ']': case')':
                    if (pila.isEmpty()) {return false;}
                    else {
                        char aux = pila.pop();
                        if (actual == '}' && aux != '{') { return false; }
                        if (actual == ']' && aux != '[') { return false; }
                        if (actual == ')' && aux != '(') { return false; }
                    }
                    break;
            }
        }
        return pila.isEmpty();
    }
    public static void main(String [] args ){
        String s= "{ }";
        System.out.print("es balanceado?" + esBalanceado(s));
    }
}
