package otrasmascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// esta es  la clase principal de la que heredan las otras clases
public class AppMascotas {
    public static void main(String[] args) {
        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro("Rex", 5));
        mascotas.add(new Gato("Misu", 3));
        mascotas.add(new Pez("Nemo", 1));
        mascotas.add(new Periquito("Piolín", 2));
        mascotas.add(new Conejo("Tambor", 4));
        mascotas.add(new Hamster("Bola", 1));

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione el animal para mostrar su información:");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. Pez");
            System.out.println("4. Periquito");
            System.out.println("5. Conejo");
            System.out.println("6. Hámster");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); 
            if (opcion == 7) {
                salir = true;
                break;
            }
            Mascota seleccionada = null;
            switch (opcion) {
                case 1:
                    for (Mascota m : mascotas) if (m instanceof Perro) seleccionada = m;
                    break;
                case 2:
                    for (Mascota m : mascotas) if (m instanceof Gato) seleccionada = m;
                    break;
                case 3:
                    for (Mascota m : mascotas) if (m instanceof Pez) seleccionada = m;
                    break;
                case 4:
                    for (Mascota m : mascotas) if (m instanceof Periquito) seleccionada = m;
                    break;
                case 5:
                    for (Mascota m : mascotas) if (m instanceof Conejo) seleccionada = m;
                    break;
                case 6:
                    for (Mascota m : mascotas) if (m instanceof Hamster) seleccionada = m;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            if (seleccionada != null) {
                System.out.println("Tipo: " + seleccionada.getTipo() + ", Nombre: " + seleccionada.getNombre() + ", Edad: " + seleccionada.getEdad());
                System.out.print("Sonido: ");
                seleccionada.emitirSonido();
            } else if (opcion >= 1 && opcion <= 6) {
                System.out.println("No hay mascota de ese tipo en la lista.");
            }
        }
        sc.close();
    }
}

