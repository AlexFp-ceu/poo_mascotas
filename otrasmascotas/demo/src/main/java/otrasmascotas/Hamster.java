package otrasmascotas;

public class Hamster extends Mascota {
    public Hamster(String nombre, int edad) {
        super(nombre, edad, "Hámster");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Chirri chirri");
    }
}
// en este caso definimos los "datos" del animal en concreto, que herada del padre