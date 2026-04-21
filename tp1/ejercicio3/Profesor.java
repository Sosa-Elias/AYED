package tp1.ejercicio3;
public class Profesor {
    private String nombre;
    private String apellido;
    private int catedra;
    private String email;
    private String facultad;


    public String tusDatos(){
        String aux = ("nombre: " + getNombre() + "\n apellido: " +
            getApellido() + "\n catedra: " + getCatedra() + "\n"
        );
        return aux;

    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getCatedra() {
        return catedra;
    }
    public void setCatedra(int catedra) {
        this.catedra = catedra;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }


    
}