package tp1.ejercicio3;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args) {
        List<Profesor> profes = new ArrayList<>();
        List<Estudiante> alumnos = new ArrayList<>();
        Estudiante e1 = new Estudiante();
        e1.setApellido("sosa");
        e1.setComision(1);
        e1.setDireccion("a");
        e1.setEmail("e@gmail");
        e1.setNombre("elias");

        Estudiante e2 = new Estudiante();
        e2.setApellido("senofonte");
        e2.setComision(1);
        e2.setDireccion("a");
        e2.setEmail("e@gmail");
        e2.setNombre("manu");

        Estudiante e3 = new Estudiante();
        e3.setApellido("sotelo");
        e3.setComision(1);
        e3.setDireccion("a");
        e3.setEmail("e@gmail");
        e3.setNombre("brahian");

        alumnos.add(e1);
        alumnos.add(e2);
        alumnos.add(e3);
        Profesor p1 = new Profesor();
        p1.setApellido("sosa");
        p1.setCatedra(1);
        p1.setFacultad("a");
        p1.setEmail("e@gmail");
        p1.setNombre("elias");

        Profesor p2 = new Profesor();
        p2.setApellido("senofonte");
        p2.setCatedra(1);
        p2.setFacultad("a");
        p2.setEmail("e@gmail");
        p2.setNombre("manu");

        Profesor p3 = new Profesor();
        p3.setApellido("sotelo");
        p3.setCatedra(1);
        p3.setFacultad("a");
        p3.setEmail("e@gmail");
        p3.setNombre("brahian");

        profes.add(p1);
        profes.add(p2);
        profes.add(p3);

        System.out.print("ARREGLO DE PROFES: \n" );
        for (Profesor prof: profes)
            System.out.print(prof.tusDatos());
        System.out.print("ARREGLO DE ALUMNOS: \n");
        for (Estudiante est: alumnos)
            System.out.print(est.tusDatos());

    }
    
}
