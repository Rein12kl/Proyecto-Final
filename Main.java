import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();
        LinkedList<Inventario> inventarios = new LinkedList<>();
        LinkedList<Estudiantes> estudiantes = new LinkedList<>();
        LinkedList<Prestamo> prestamos = new LinkedList<>();

        // Datos de prueba para estudiantes de Diseño
        Estudiantes estudiante1 = new Estudiantes();
        ObjEstudiante_Diseño diseno1 = new ObjEstudiante_Diseño();
        diseno1.setCedula("12345");
        diseno1.setNombre("Juan");
        diseno1.setApellido("Pérez");
        diseno1.setTelefono("3001234567");
        diseno1.setModalidadEstudio("virtual");
        diseno1.setCantidadAsignaturas(5);
        diseno1.setSerial(1001);
        LinkedList<ObjEstudiante_Diseño> listaDiseno = new LinkedList<>();
        listaDiseno.add(diseno1);
        estudiante1.setEstudiantesDiseno(listaDiseno);
        estudiantes.add(estudiante1);

        // Datos de prueba para estudiantes de Ingeniería
        Estudiantes estudiante2 = new Estudiantes();
        ObjEstudiante_Ingenieria ing1 = new ObjEstudiante_Ingenieria();
        ing1.setCedula("67890");
        ing1.setNombre("Ana");
        ing1.setApellido("Gómez");
        ing1.setTelefono("3109876543");
        ing1.setNumeroSemestre(7);
        ing1.setPromedioAcumulado(4.2f);
        ing1.setSerial("2002");
        LinkedList<ObjEstudiante_Ingenieria> listaIng = new LinkedList<>();
        listaIng.add(ing1);
        estudiante2.setEstudiantesIngenieria(listaIng);
        estudiantes.add(estudiante2);

        // Datos de prueba para inventario: Computador Portátil
        Inventario inventario1 = new Inventario();
        ObjComputador_Portatil comp1 = new ObjComputador_Portatil();
        comp1.setSerial("CP100");
        comp1.setMarca("Lenovo");
        comp1.setTamano(15.6f);
        comp1.setPrecio(2500000f);
        comp1.setSistemaOperativo("W10");
        comp1.setProcesador("Intel Core i5");
        LinkedList<ObjComputador_Portatil> listaComp = new LinkedList<>();
        listaComp.add(comp1);
        inventario1.setLista_computadores(listaComp);
        inventarios.add(inventario1);

        // Datos de prueba para inventario: Tableta Gráfica
        Inventario inventario2 = new Inventario();
        ObjTableta_Grafica tab1 = new ObjTableta_Grafica();
        tab1.setSerial("TG200");
        tab1.setMarca("Wacom");
        tab1.setTamano(13.3f);
        tab1.setPrecio(1200000f);
        tab1.setAlmacenamiento(512);
        tab1.setPeso(0.8f);
        LinkedList<ObjTableta_Grafica> listaTab = new LinkedList<>();
        listaTab.add(tab1);
        inventario2.setLista_impresoras(listaTab);
        inventarios.add(inventario2);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Ingresar Estudiante");
            System.out.println("2. Ingresar Inventario");
            System.out.println("3. Registrar Préstamo de Equipo");
            System.out.println("4. Modificar Préstamo de Equipo");
            System.out.println("5. Devolución de Equipo");
            System.out.println("6. Buscar Equipo");
            System.out.println("7. Agregar mas inventario");
            System.out.println("8. Imprimir Inventario Total");
            System.out.println("9. Imprimir Estudiantes");
            System.out.println("0. Salir");
            System.out.println("");

            int opcion = 0;
            while (true) {
                System.out.print("\nSeleccione una opción: ");
                System.out.println("");
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    if (opcion >= 0 && opcion <= 9) {
                        break;
                    } else {
                        System.out.println("Opción no válida. Debe ser un número entre 0 y 9.");
                        System.out.println("");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    System.out.println("");
                    sc.next();
                }
            }

            switch (opcion) {
                case 1:
                    estudiantes = metodos.IngresarEstudiante(estudiantes);
                    break;
                case 2:
                    inventarios = metodos.IngresarInventario(inventarios);
                    break;
                case 3:
                    prestamos = metodos.RegistrarPrestamoEquipo(inventarios, estudiantes);
                    break;
                case 4:
                    prestamos = metodos.ModificarPrestamoEquipo(prestamos);
                    break;
                case 5:
                    prestamos = metodos.DevolucionEquipo(prestamos);
                    break;
                case 6:

                    System.out.println("\n¿Cómo desea buscar el préstamo?");
                    System.out.println("1. Por cédula del estudiante");
                    System.out.println("2. Por serial del equipo");

                    int opcionBusqueda = 0;
                    while (true) {
                        System.out.println("");
                        System.out.print("Seleccione una opción: ");
                        System.out.println("");
                        if (sc.hasNextInt()) {
                            opcionBusqueda = sc.nextInt();
                            if (opcionBusqueda == 1 || opcionBusqueda == 2) {
                                break;
                            } else {
                                System.out.println("Opción no válida. Debe ser 1 o 2.");
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Entrada inválida. Debe ingresar un número entero.");
                            System.out.println("");
                            sc.next();
                        }
                    }

                    String busqueda = "";
                    if (opcionBusqueda == 1) {
                        System.out.print("Ingrese la cédula del estudiante: ");
                        System.out.println("");
                        busqueda = sc.next();
                    } else {
                        System.out.print("Ingrese el serial del equipo: ");
                        System.out.println("");
                        busqueda = sc.next();
                    }

                    Prestamo prestamo = metodos.BuscarEquipo(prestamos, opcionBusqueda, busqueda);
                    System.out.println(prestamo);
                    System.out.println("");
                    break;
                case 7:
                    inventarios = metodos.IngresarInventario(inventarios);
                    break;
                case 8:
                    metodos.ImprimirInventarioTotal(inventarios);
                    System.out.println("");
                    break;
                case 9:
                    metodos.ImprimirEstudiantes(estudiantes);
                    System.out.println("");
                    break;
                case 0:
                    continuar = false;
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    System.out.println("");
            }
        }
        sc.close();
    }
}
