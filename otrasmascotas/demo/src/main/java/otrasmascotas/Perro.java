package otrasmascotas;

// Pilar POO: Herencia y Polimorfismo
public class Perro extends Mascota {
    public Perro(String nombre, int edad) {
        super(nombre, edad, "Perro");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Guau");
    }
}
// en este caso definimos los "datos" del animal en concreto, que herada del padre