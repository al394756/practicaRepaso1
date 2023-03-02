public class Motocicleta extends Vehiculos{
    private int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Motocicleta(String matricula, Persona propietario, boolean circular) {
        super(matricula, propietario, circular);
    }
}
