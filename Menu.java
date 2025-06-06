import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean bandera1 = true;
        int opt_tipoEstudiante = 0;
        Metodos m = new Metodos();
        LinkedList ingenieria = new LinkedList<ObjEstudiante_Ingenieria>();
        LinkedList diseño = new LinkedList<ObjEstudiante_Diseño>();
        LinkedList Computador = new LinkedList<ObjComputador_Portatil>();
        LinkedList Tableta = new LinkedList<ObjTableta_Grafica>();

        while (bandera1) {
            System.out.println("Bienvenido al programa de equipos electronicos San Juan de Dios");
            System.out.println("1. Estudiante de ingenieria");
            System.out.println("2. Estudiante de diseño");
            System.out.println("3. Salir");
            System.out.println();

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese una opcion con numeros del 1 al 3");
                sc.next();
            }
            opt_tipoEstudiante = sc.nextInt();

            if (opt_tipoEstudiante == 1) {
                m.Menu_ingenieria(ingenieria, Computador);
            }
            if (opt_tipoEstudiante == 2) {
                m.Menu_Diseño(diseño, Tableta);
            }
            if (opt_tipoEstudiante == 3) {
                bandera1 = false;
            }

            if (opt_tipoEstudiante < 1 || opt_tipoEstudiante > 3) {
                System.out.println("Opcion invalida");

            }
        }
    }
}
