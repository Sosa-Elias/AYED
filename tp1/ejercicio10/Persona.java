package tp1.ejercicio10;

public class Persona {
    private String nombre;
    private boolean Prioridad;


    
    public Persona(String nombre, boolean prioridad) {
        this.nombre = nombre;
        Prioridad = prioridad;
    }
        

    public String toString(){
        String texto = "Nombre: "+ getNombre() + "\nTiene prioridad: "+ isPrioridad();
        return texto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isPrioridad() {
        return Prioridad;
    }
    public void setPrioridad(boolean prioridad) {
        Prioridad = prioridad;
    }
    
}
