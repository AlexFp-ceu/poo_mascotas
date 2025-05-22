package otrasmascotas;

// Pilar POO: Abstracción y Encapsulamiento
public abstract class Mascota {
    // Encapsulamiento: atributos privados
    private String nombre;
    private int edad;
    private String tipo;

    // Constructor parametrizado
    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    // Pilar POO: Polimorfismo (método abstracto)
    public abstract void emitirSonido();
}
// en este caso definimos los "datos" del animal en concreto, que herada del padre