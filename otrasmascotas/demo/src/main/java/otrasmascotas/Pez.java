package otrasmascotas;

public class Pez extends Mascota {
    public Pez(String nombre, int edad) {
        super(nombre, edad, "Pez");
    }
    @Override
    public void emitirSonido() {
        System.out.println("(glu glu glu)");
    }
}
// en este caso definimos los "datos" del animal en concreto, que herada del padre