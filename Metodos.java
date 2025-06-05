import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public void Menu_ingenieria(LinkedList<ObjEstudiante_Ingenieria> L1, LinkedList<ObjComputador_Portatil> L2) {
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
                    IngresarEstudiante(L1);
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

    public void Menu_Diseño(LinkedList<ObjEstudiante_Diseño> L1, LinkedList<ObjTableta_Grafica> L2) {
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

    public void IngresarEstudiante(LinkedList<ObjEstudiante_Ingenieria> L1) {
        boolean bandera = true;
        int dec = 1;
        while (bandera) {

            ObjEstudiante_Ingenieria o = new ObjEstudiante_Ingenieria();
            o.setNombre(sc.nextLine());
            o.setApellido(sc.nextLine());
            o.setCedula(sc.nextLine());
            o.setNumeroSemestre(sc.nextInt());
            o.setPromedioAcumulado(sc.nextFloat());
            L1.add(o);

            System.out.println("Se ingreso estiudiante exitosamente ");

            System.out.println("Desea ingresar un nuevo estudiante? 1 si, 2 no");
            dec = sc.nextInt();

            if(dec == 1){
                bandera = true;
            }

            if (dec == 2) {
                bandera = false;
            }
        }
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
