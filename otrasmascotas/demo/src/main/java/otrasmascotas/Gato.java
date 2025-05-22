package otrasmascotas;

public class Gato extends Mascota {
    public Gato(String nombre, int edad) {
        super(nombre, edad, "Gato");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }
}

// en este caso definimos los "datos" del animal en concreto, que herada del padre