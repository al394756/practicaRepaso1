import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculosTest {
    Ciudad ciudad = new Ciudad("Castellon","12006","Castellon",152649);
    Persona persona = new Persona("David","del Rio",21,ciudad);
    Persona persona2 = new Persona("Antonio","del Rio",15,ciudad);
    Vehiculos vehiculos = new Vehiculos("256984W",persona,true);

    @Test
    public void comprobar(){
        assertTrue(vehiculos.comprobacionMayoriaDeEdad(persona));
        assertFalse(vehiculos.comprobacionMayoriaDeEdad(persona2));
    }
}