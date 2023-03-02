public class Coche extends Vehiculos {
    private int numero_puertas;

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public Coche(String matricula, Persona propietario, boolean circular) {
        super(matricula, propietario, circular);
    }
}
