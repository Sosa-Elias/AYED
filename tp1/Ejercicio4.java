package tp1;

public class Ejercicio4 {

     public static void swap1 (int a, int b) {
        if (a < b) {
            int tmp = a ;
            a = b ;
            b = tmp;
        }
    }
    public static void swap2 (Integer c, Integer d) {
        if (c < d) {
            int tmp = c ;
            c = d ;
            d = tmp;
        }
 
    }
    public static void main(String[] args) {
        int a = 1, b = 2;
        Integer c = 3, d = 4;
        swap1(a,b);
        swap2(c,d);
        System.out.println("a=" + a + " b=" + b) ;
        System.out.println("c=" + c + " d=" + d) ;
 }
}


