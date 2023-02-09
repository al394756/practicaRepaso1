public class Ciudad {
    private String nombre;
    private String codigoPostal;
    private String provincia;
    private int numHabitantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public Ciudad(String nombre, String codigoPostal, String provincia, int numHabitantes) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.numHabitantes = numHabitantes;
    }
}
