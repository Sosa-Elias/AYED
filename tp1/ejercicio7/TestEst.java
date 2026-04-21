package tp1.ejercicio7;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TestEst {
    public static void Exp (       List<Estudiante> est ) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();
        e1.setNombre("manu");
        e2.setNombre("tomi");
        e3.setNombre("facundo");
        est.add(e1);
        est.add(e2);
        est.add(e3);

        List<Estudiante> copia = new ArrayList<>(est);
        System.out.print(est.get(0).getNombre() + "\n");
        System.out.print(copia.get(0).getNombre() + "\n");
        est.get(0).setNombre("manuchao");
        System.out.print(est.get(0).getNombre() + "\n");
        System.out.print(copia.get(0).getNombre() + "\n");

     }
    public static String NuevoE(){
        Scanner s = new Scanner(System.in);
        System.out.print("ingrese un nuevo nombre: ");
        String Aux = s.next();
        s.close();
        return Aux;

    } 
    public static void main(String [] args ){
        List<Estudiante> est = new ArrayList<>();
        Exp(est);
        boolean existe = false;
        String aux = NuevoE();
        for (Estudiante e: est){
            if(e.getNombre().equals(aux)) {
                 existe = true;  
                break;} }
        if(existe == false){
            Estudiante e4 = new Estudiante();
            e4.setNombre(aux);
            est.add(e4);
            System.out.print("nuevo estudiante:" + aux);

        }   
            
        }
    }
    

