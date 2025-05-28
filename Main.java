
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    Estudiantes estudiante = m.IngresarEstudiante(); //revisar esto
                    if (estudiante != null) {
                        listaEstudiantes.add(estudiante);
                    }
                    break;
                case "2":
                    Inventario inventario = m.IngresarInventario();//revisar esto
                    if (inventario != null) {
                        listaInventarios.add(inventario);
                    }
                    break;
                case "3":
                    m.RegistrarPrestamoEquipo(listaInventarios, listaEstudiantes);
                    break;
                case "4":
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        sc.close();
    }

    
    }

