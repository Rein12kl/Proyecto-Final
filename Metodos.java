import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public void Menu_ingenieria() {
        boolean bandera = true;
        int opt_Inge = 0;

        while (bandera) {
            System.out.println("Opciones de ingenieria");
            System.out.println("Registrar prestamo de un equipo");
            System.out.println("Devolucion del equipo");
            System.out.println("Buscar equipo");
            System.out.println("Volver a menu principal");
            System.out.println();

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese valores numericos del 1 al 5");
                sc.next();
            }
            opt_Inge = sc.nextInt();

            switch (opt_Inge) {
                case 1:
                    System.out.println("Maintenance\n");
                    break;
                case 2:
                    System.out.println("Maintenance\n");
                    break;
                case 3:
                    System.out.println("Maintenance\n");
                    break;
                case 4:
                    System.out.println("Maintenance\n");
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("opcion invalida\n");
                    break;
            }

        }

    }

    public void Menu_Diseño() {
        boolean bandera = true;
        while (bandera) {
            System.out.println("Opciones de ingenieria");
            System.out.println("Registrar prestamo de un equipo");
            System.out.println("Devolucion del equipo");
            System.out.println("Buscar equipo");
            System.out.println("Volver a menu principal");
            System.out.println();

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese valores numericos del 1 al 5");
                sc.next();
            }
            int opt_Dis = sc.nextInt();

            switch (opt_Dis) {
                case 1:
                    System.out.println("Maintenance\n");
                    break;
                case 2:
                    System.out.println("Maintenance\n");
                    break;
                case 3:
                    System.out.println("Maintenance\n");
                    break;
                case 4:
                    System.out.println("Maintenance\n");
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("opcion invalida\n");
                    break;
            }

        }

    }

    public void IngresarEstudiante() {

        System.out.println("Se ingreso estiudiante exitosamente ");
    }

    public void RegistrarPrestamoEquipo() {

        System.out.println("Se registro prestamo de equipo a estudiante : ");
    }

    public void ModificarPrestamoEquipo() {

        System.out.println("Se modifico prestamo de equipo a estudiante : ");
    }

    public void DevolucionEquipo() {

        System.out.println("Se registro devolucion de equipo a estudiante : ");
    }

    public void BuscarEquipo() {

        System.out.println("El equipo : " + " Lo tiene el estudiante : ");
    }

    public void AgregarComputadorPortatil() {

        System.out.println("Se registro computador exitosamente.");
    }

    public void ImprimirInventarioTotal() {

        System.out.println("Inventario total");
    }
}
