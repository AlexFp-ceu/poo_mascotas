package otrasmascotas;

public class Conejo extends Mascota {
    public Conejo(String nombre, int edad) {
        super(nombre, edad, "Conejo");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Skri Skri");
    }
}

// en este caso definimos los "datos" del animal en concreto, que herada del padre