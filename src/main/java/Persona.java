public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private Ciudad ciudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public Persona(String nombre, String apellidos, int edad, Ciudad ciudad){
        this.ciudad = ciudad;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nombre = nombre;
    }
}
