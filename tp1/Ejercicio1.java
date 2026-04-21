package tp1;
public class Ejercicio1 {

    public static void ImprimirConFor(int a, int b) {
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }

    public static void ImprimirConwhile(int a, int b){
        int i = a;
        while (i <= b){
            System.out.println(i);
            i++;
        }
    }

    public static void ImprimirRecursivo(int a, int b){
        if (a > b){
            return;
        }
        System.out.println(a);
        ImprimirRecursivo(a + 1, b);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int ab = 23;
        int bb = 27;
        int ac = 88;
        int bc = 94;
        ImprimirConFor(a, b);
        ImprimirConwhile(ab, bb);
        ImprimirRecursivo(ac, bc);
    }
}