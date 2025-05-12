import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean bandera1 = true;
        boolean bandera2 = true;
        boolean bandera3 = true;
        int opt_tipoEstudiante = 0;
        int opt_Inge = 0;

        while (bandera1) {
            System.out.println("Bienvenido al programa de equipos electronicos San Juan de Dios");
            System.out.println("1. Estudiante de ingenieria");
            System.out.println("2. Estudiante de diseño");
            System.out.println("3. Salir");
            System.out.println();

            opt_tipoEstudiante = sc.nextInt();

            if (opt_tipoEstudiante == 1) {
                while (bandera2) {
                    System.out.println("Opciones de ingenieria");
                    System.out.println("Registrar prestamo de un equipo");
                    System.out.println("Devolucion del equipo");
                    System.out.println("Buscar equipo");
                    System.out.println("Volver a menu principal");
                    System.out.println();
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
                            System.out.println("Maintenance\n");
                            break;
                        default:
                            System.out.println("opcion invalida\n");
                            break;
                    }

                }

            }
        }
    }
}
