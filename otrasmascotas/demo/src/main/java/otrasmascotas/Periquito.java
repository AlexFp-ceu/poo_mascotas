package otrasmascotas;

public class Periquito extends Mascota {
    public Periquito(String nombre, int edad) {
        super(nombre, edad, "Periquito");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Pío pío");
    }
}
// en este caso definimos los "datos" del animal en concreto, que herada del padre