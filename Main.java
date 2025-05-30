
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt1 = 0;
        MetodosAlternativos m = new MetodosAlternativos();

        LinkedList<Estudiantes> listaEstudiantes = new LinkedList<>();
        LinkedList<Inventario> listaInventarios = new LinkedList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n==== GESTOR DE PRÉSTAMO EQUIPOS SAN JUAN DE DIOS ====");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ingresar inventario");
            System.out.println("3. Registrar préstamo de equipo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un valor numerico");
                sc.next();
            }
            opt1 = sc.nextInt();

            switch (opt1) {
                case 1:
                    m.IngresarEstudiante();
                    break;
            
                case 2:
                    m.IngresarInventario();
                    break;
                
                case 3:
                    m.RegistrarPrestamoEquipo();
                    break;
                
                case 4:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("opcion invalida");
                    break;
            }

        }
    }

}
