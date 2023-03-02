public class Hacienda {
    public static void main(String[] args) {
        //Existe una persona de nombre Javier Andrés Martín
        int numero = 45;
        Persona persona = new Persona();
        persona.setNombre("Javier");
        persona.setApellidos("Andres Martin");
        Ciudad ciudad = new Ciudad("Castellon","12006","Castellon",12456);
        persona.setCiudad(ciudad);
        persona.setEdad(21);
        //Tiene a su nombre 2 propiedades: una casa y una motocicleta
        Casa casa = new Casa();
        casa.setPropietario(persona);
        Vehiculos motocicleta = new Motocicleta("4926546E",persona,true);
        //Ha conseguido pagar su casa por lo que ya es suya
        casa.pagar();

        //Decide cambiar su preciosa motocicleta por un coche
        motocicleta = new Coche("19649B",persona,true);
        motocicleta.pagar();

    }
}
