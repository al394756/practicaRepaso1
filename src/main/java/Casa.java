public class Casa implements Propiedad{
    private String direccion;
    private int numero;
    private int habitaciones;
    private Persona propietario;

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", numero=" + numero +
                ", habitaciones=" + habitaciones +
                ", propietario=" + propietario +
                ", ciudad=" + ciudad +
                '}';
    }

    private Ciudad ciudad;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public void pagar() {
        System.out.println("He pagado una casa");
    }
}
