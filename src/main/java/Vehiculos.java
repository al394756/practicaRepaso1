public class Vehiculos implements Propiedad{
    private String matricula;
    private Persona propietario;
    private boolean circular;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public boolean isCircular() {
        return circular;
    }

    public void setCircular(boolean circular) {
        this.circular = circular;
    }
    public boolean comprobacionMayoriaDeEdad(Persona propietario){
        if(propietario.getEdad() >= 18)
            return true;
        return false;

    }
    public Vehiculos(String matricula, Persona propietario, boolean circular) {
        if (comprobacionMayoriaDeEdad(propietario)) {
            this.matricula = matricula;
            this.circular = circular;
            this.propietario = propietario;
        }
    }

    @Override
    public void pagar() {
        System.out.println("He pagado un vehiculo");
    }
}
