import java.util.LinkedList;
import java.util.Scanner;

public class MetodosAlternativos {
    Scanner sc = new Scanner(System.in);
    
    public void IngresarEstudiante() {
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Qué tipo de estudiante desea ingresar?");
            System.out.println("1. Estudiante de Diseño");
            System.out.println("2. Estudiante de Ingeniería");
            int tipo = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                if (sc.hasNextInt()) {
                    tipo = sc.nextInt();
                    sc.nextLine(); 
                    if (tipo == 1 || tipo == 2) {
                        break;
                    } else {
                        System.out.println("Opción no válida. Debe ser 1 o 2.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    sc.next(); 
                }
            }

            if (tipo == 1) {
                ObjEstudiante_Diseño estudianteDiseno = new ObjEstudiante_Diseño();
                System.out.print("Ingrese cédula: ");
                while (sc.hasNextInt()) {
                    System.out.print("Ingrese una cédula válida.");
                    sc.next();
                }
                String cedula = sc.next();
                estudianteDiseno.setCedula(sc.nextLine());
                System.out.print("Ingrese nombre: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un nombre válido.");
                    sc.next();
                }
                String nombre = sc.next();
                estudianteDiseno.setNombre(sc.nextLine());

                System.out.print("Ingrese apellido: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un apellido válido.");
                    sc.next();
                }
                String apellido = sc.next();
                estudianteDiseno.setApellido(sc.nextLine());

                System.out.print("Ingrese teléfono: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un teléfono válido.");
                    sc.next();
                }
                String telefono = sc.next();
                estudianteDiseno.setTelefono(sc.nextLine());

                System.out.print("Ingrese modalidad de estudio (virtual/presencial): ");
                String ModalidadEstudio = sc.next();
                while (true) {
                    ModalidadEstudio = sc.nextLine();
                    if (ModalidadEstudio.equalsIgnoreCase("virtual") || ModalidadEstudio.equalsIgnoreCase("presencial"))
                        break;
                    System.out.println("Ingrese una opción válida (virtual/presencial):");
                }
                estudianteDiseno.setModalidadEstudio(ModalidadEstudio);

                System.out.print("Ingrese cantidad de asignaturas: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese una cantidad de asignaturas válida.");
                    sc.next();
                }
                int CantidadAsignatura = sc.nextInt();
                estudianteDiseno.setCantidadAsignaturas(sc.nextInt());
                sc.next();

                System.out.print("Ingrese serial: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un serial válido.");
                    sc.next();
                }
                int Serial = sc.nextInt();
                estudianteDiseno.setSerial(sc.nextInt());
                sc.next();
                Estudiantes estudiantes = new Estudiantes();
                LinkedList<ObjEstudiante_Diseño> listaDiseno = estudiantes.getEstudiantesDiseno();
                if (listaDiseno == null) {
                    listaDiseno = new LinkedList<>();
                }
                listaDiseno.add(estudianteDiseno);
                estudiantes.setEstudiantesDiseno(listaDiseno);
                System.out.println("Estudiante de Diseño ingresado exitosamente.");
            } else if (tipo == 2) {
                ObjEstudiante_Ingenieria estudianteIngenieria = new ObjEstudiante_Ingenieria();
                System.out.print("Ingrese cédula: ");
                while (sc.hasNextInt()) {
                    System.out.print("Ingrese una cédula válida.");
                    sc.next();
                }
                String cedula = sc.next();
                estudianteIngenieria.setCedula(sc.nextLine());

                System.out.print("Ingrese nombre: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un nombre válido.");
                    sc.next();
                }
                String nombre = sc.next();
                estudianteIngenieria.setNombre(sc.nextLine());

                System.out.print("Ingrese apellido: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un apellido válido.");
                    sc.next();
                }
                String apellido = sc.next();
                estudianteIngenieria.setApellido(sc.nextLine());

                System.out.print("Ingrese teléfono: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un teléfono válido.");
                    sc.next();
                }
                String telefono = sc.next();
                estudianteIngenieria.setTelefono(sc.nextLine());

                System.out.print("Ingrese número de semestre: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un semestre válido.");
                    sc.next();
                }
                int NumeroSemestre = sc.nextInt();
                estudianteIngenieria.setNumeroSemestre(sc.nextInt());
                sc.nextLine();

                System.out.print("Ingrese promedio acumulado: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese una cantidad de asignaturas válida.");
                    sc.next();
                }
                float PromedioAcumulado = sc.nextFloat();
                estudianteIngenieria.setPromedioAcumulado(sc.nextFloat());
                sc.nextLine();

                System.out.print("Ingrese serial: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un serial válido.");
                    sc.next();
                }
                String Serial = sc.next();
                estudianteIngenieria.setSerial(sc.nextLine());
                Estudiantes estudiantes = new Estudiantes();
                LinkedList<ObjEstudiante_Ingenieria> listaIngenieria = estudiantes.getEstudiantesIngenieria();
                if (listaIngenieria == null) {
                    listaIngenieria = new LinkedList<>();
                }
                listaIngenieria.add(estudianteIngenieria);
                estudiantes.setEstudiantesIngenieria(listaIngenieria);
                System.out.println("Estudiante de Ingeniería ingresado exitosamente.");
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea ingresar otro estudiante? (s/n): ");
            String respuesta;
            while (true) {
                respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Debe ingresar 's' o 'n'.");
                }
            }
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }

        }
        
    }

    public void IngresarInventario() {
        Inventario inventario = new Inventario();
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Qué tipo de equipo desea ingresar?");
            System.out.println("1. Computador Portátil");
            System.out.println("2. Tableta Gráfica");
            int tipo = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                if (sc.hasNextInt()) {
                    tipo = sc.nextInt();
                    sc.next(); 
                    if (tipo == 1 || tipo == 2) {
                        break;
                    } else {
                        System.out.println("Opción no válida. Debe ser 1 o 2.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    sc.next(); 
                }
            }

            if (tipo == 1) {
                ObjComputador_Portatil computador = new ObjComputador_Portatil();
                System.out.print("Ingrese serial: ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un serial válido.");
                    sc.next();
                }
                String Serial= sc.next();
                computador.setSerial(sc.nextLine());
                
                System.out.print("Ingrese marca: ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese una Marca válido.");
                    sc.next();
                }
                String Marca= sc.next();
                computador.setMarca(sc.nextLine());

                System.out.print("Ingrese tamaño (pulgadas): ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un tamaño válido.");
                    sc.next();
                }
                float Tamano= sc.nextFloat();
                computador.setTamano(sc.nextFloat());
                sc.nextLine(); 

                System.out.print("Ingrese precio: ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un precio válido.");
                    sc.next();
                }
                float Precio= sc.nextFloat();
                computador.setPrecio(sc.nextFloat());
                sc.next(); 

                
                String sistemaOperativo = "";
                while (true) {
                    System.out.print("Seleccione un sistema operativo");
                    System.out.println("1. Windows 7 (W7)");
                    System.out.println("2. Windows 10 (W10)");
                    System.out.println("3. Windows 11 (W11)");
                    if (sc.hasNextInt()) {
                        int opcion = sc.nextInt();
                        sc.nextLine(); 
                        switch (opcion) {
                            case 1:
                                sistemaOperativo = "W7";
                                break;
                            case 2:
                                sistemaOperativo = "W10";
                                break;
                            case 3:
                                sistemaOperativo = "W11";
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                                continue;
                        }
                        break;
                    } else {
                        System.out.println("Entrada inválida. Ingrese un número.");
                        sc.next(); 
                    }
                }
                computador.setSistemaOperativo(sistemaOperativo);

                String procesador = "";
                while (true) {
                    System.out.println("Seleccione procesador:");
                    System.out.println("1. AMD Ryzen");
                    System.out.println("2. Intel Core i5");
                    System.out.print("Opción: ");
                    if (sc.hasNextInt()) {
                        int opcion = sc.nextInt();
                        sc.next(); 
                        switch (opcion) {
                            case 1:
                                procesador = "AMD Ryzen";
                                break;
                            case 2:
                                procesador = "Intel Core i5";
                                break;
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                                continue;
                        }
                        break;
                    } else {
                        System.out.println("Entrada inválida. Ingrese un número.");
                        sc.next(); 
                    }
                }
                computador.setProcesador(procesador);

                LinkedList<ObjComputador_Portatil> listaComputadores = inventario.getLista_computadores();
                if (listaComputadores == null) {
                    listaComputadores = new LinkedList<>();
                }
                listaComputadores.add(computador);
                inventario.setLista_computadores(listaComputadores);
                System.out.println("Computador Portátil ingresado exitosamente.");
            } else if (tipo == 2) {
                ObjTableta_Grafica tableta = new ObjTableta_Grafica();
                System.out.print("Ingrese serial: ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un serial válido.");
                    sc.next();
                }
                String Serial= sc.next();
                tableta.setSerial(sc.nextLine());

                System.out.print("Ingrese marca: ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese una Marca válido.");
                    sc.next();
                }
                String Marca= sc.next();
                tableta.setMarca(sc.nextLine());

                System.out.print("Ingrese tamaño (pulgadas): ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un tamaño válido.");
                    sc.next();
                }
                float Tamano= sc.nextFloat();
                tableta.setTamano(sc.nextFloat());
                sc.next(); 

                System.out.print("Ingrese precio: ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un precio válido.");
                    sc.next();
                }
                float Precio= sc.nextFloat();
                tableta.setPrecio(sc.nextFloat());
                sc.next(); 

                System.out.print("Seleccione un almacenamiento");
                int almacenamiento = 0;
                while(true){
                    System.out.println("1. 256 GB");
                    System.out.println("2. 512 GB");
                    System.out.println("3. 1024 GB");
                
                if(sc.hasNextInt()){
                    int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    almacenamiento = 256;
                    break;
                case 2:
                    almacenamiento = 512;
                    break;
                case 3:
                    almacenamiento = 1024;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
                }
                break;
                }
                else{
                    System.out.println("Entrada inválida. Debe ingresar una opción válida.");
                    sc.next(); 
                } 
                tableta.setAlmacenamiento(almacenamiento);

                System.out.print("Ingrese peso (kg): ");
                while(!sc.hasNextInt()){
                    System.out.print("Ingrese un peso válido.");
                    sc.next();
                }
                float Peso= sc.nextFloat();
                tableta.setPeso(sc.nextFloat());
                sc.next(); 

                
                LinkedList<ObjTableta_Grafica> listaTabletas = inventario.getLista_impresoras();
                if (listaTabletas == null) {
                    listaTabletas = new LinkedList<>();
                }
                listaTabletas.add(tableta);
                inventario.setLista_impresoras(listaTabletas);
                System.out.println("Tableta Gráfica ingresada exitosamente.");
            } //este coso sobra pero no sé por qué
            else {
                System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea ingresar otro equipo? (s/n): ");
            String respuesta;
            while (true) {
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Debe ingresar 's' o 'n'.");
                }
            }
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
    }

    public void RegistrarPrestamoEquipo(LinkedList<Inventario> inventarios, LinkedList<Estudiantes> estudiantes) {
        boolean continuar = true;
        while (continuar) {
            // Imprimir inventario y estudiantes disponibles
            ImprimirInventarioTotal(inventarios);
            ImprimirEstudiantes(estudiantes);

            System.out.println("¿Qué tipo de estudiante desea registrar para el préstamo?");
            System.out.println("1. Estudiante de Diseño");
            System.out.println("2. Estudiante de Ingeniería");
            int tipoEstudiante = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                if (sc.hasNextInt()) {
                    tipoEstudiante = sc.nextInt();
                    sc.next(); 
                    if (tipoEstudiante == 1 || tipoEstudiante == 2) {
                        break;
                    } else {
                        System.out.println("Opción no válida. Debe ser 1 o 2.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    sc.nextLine(); 
                }
            }

            System.out.println("¿Qué tipo de equipo desea prestar?");
            System.out.println("1. Computador Portátil");
            System.out.println("2. Tableta Gráfica");
            int tipoEquipo = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                if (sc.hasNextInt()) {
                    tipoEquipo = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    if (tipoEquipo == 1 || tipoEquipo == 2) {
                        break;
                    } else {
                        System.out.println("Opción no válida. Debe ser 1 o 2.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    sc.next(); // Limpiar entrada inválida
                }
            }

            // Preguntar por la cédula del estudiante
            System.out.print("Ingrese la cédula del estudiante: ");
            String cedula = sc.next();

            // Preguntar por el serial del inventario
            System.out.print("Ingrese el serial del inventario: ");
            String serial = sc.next();

            // Crear objeto Prestamo
            Prestamo prestamo = new Prestamo();
            Estudiantes estudianteObj = null;
            Inventario inventarioObj = null;

            // Buscar el estudiante por cédula
            for (Estudiantes estudiante : estudiantes) {
                if (tipoEstudiante == 1) {
                    for (ObjEstudiante_Diseño diseno : estudiante.getEstudiantesDiseno()) {
                        if (diseno.getCedula().equals(cedula)) {
                            estudianteObj = estudiante;
                            break;
                        }
                    }
                } else {
                    for (ObjEstudiante_Ingenieria ingenieria : estudiante.getEstudiantesIngenieria()) {
                        if (ingenieria.getCedula().equals(cedula)) {
                            estudianteObj = estudiante;
                            break;
                        }
                    }
                }
                if (estudianteObj != null)
                    break;
            }

            // Buscar el inventario por serial
            for (Inventario inventario : inventarios) {
                if (tipoEquipo == 1) {
                    for (ObjComputador_Portatil computador : inventario.getLista_computadores()) {
                        if (computador.getSerial().equals(serial)) {
                            inventarioObj = inventario;
                            break;
                        }
                    }
                } else {
                    for (ObjTableta_Grafica tableta : inventario.getLista_impresoras()) {
                        if (tableta.getSerial().equals(serial)) {
                            inventarioObj = inventario;
                            break;
                        }
                    }
                }
                if (inventarioObj != null)
                    break;
            }

            if (estudianteObj != null && inventarioObj != null) {
                prestamo.setEstudiante(estudianteObj);
                prestamo.setInventario(inventarioObj);
                System.out.println("Préstamo registrado exitosamente.");
            } else {
                System.out.println("No se encontró el estudiante o el inventario especificado.");
            }

            System.out.print("¿Desea realizar otro préstamo? (s/n): ");
            String respuesta;
            while (true) {
                respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Debe ingresar 's' o 'n'.");
                }
            }
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
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

    public void ImprimirInventarioTotal(LinkedList<Inventario> inventarios) {
        if (inventarios == null || inventarios.isEmpty()) {
            System.out.println("No hay inventario para imprimir.");
            return;
        }
        for (Inventario inventario : inventarios) {
            System.out.println("--- INVENTARIO ---");
            System.out.println("Computadores Portátiles:");
            LinkedList<ObjComputador_Portatil> computadores = inventario.getLista_computadores();
            if (computadores != null) {
                for (ObjComputador_Portatil computador : computadores) {
                    System.out.println("Serial: " + computador.getSerial());
                    System.out.println("Marca: " + computador.getMarca());
                    System.out.println("Tamaño: " + computador.getTamano() + " pulgadas");
                    System.out.println("Precio: " + computador.getPrecio());
                    System.out.println("Sistema Operativo: " + computador.getSistemaOperativo());
                    System.out.println("Procesador: " + computador.getProcesador());
                    System.out.println("-------------------");
                }
            }
            System.out.println("Tabletas Gráficas:");
            LinkedList<ObjTableta_Grafica> tabletas = inventario.getLista_impresoras();
            if (tabletas != null) {
                for (ObjTableta_Grafica tableta : tabletas) {
                    System.out.println("Serial: " + tableta.getSerial());
                    System.out.println("Marca: " + tableta.getMarca());
                    System.out.println("Tamaño: " + tableta.getTamano() + " pulgadas");
                    System.out.println("Precio: " + tableta.getPrecio());
                    System.out.println("Almacenamiento: " + tableta.getAlmacenamiento() + " GB");
                    System.out.println("Peso: " + tableta.getPeso() + " kg");
                    System.out.println("-------------------");
                }
            }
        }
    }

    public void ImprimirEstudiantes(LinkedList<Estudiantes> estudiantes) {
        if (estudiantes == null || estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para imprimir.");
            return;
        }
        for (Estudiantes estudiante : estudiantes) {
            System.out.println("--- ESTUDIANTES ---");
            System.out.println("Estudiantes de Diseño:");
            LinkedList<ObjEstudiante_Diseño> estudiantesDiseno = estudiante.getEstudiantesDiseno();
            if (estudiantesDiseno != null) {
                for (ObjEstudiante_Diseño diseno : estudiantesDiseno) {
                    System.out.println("Cédula: " + diseno.getCedula());
                    System.out.println("Nombre: " + diseno.getNombre());
                    System.out.println("Apellido: " + diseno.getApellido());
                    System.out.println("Teléfono: " + diseno.getTelefono());
                    System.out.println("Modalidad de Estudio: " + diseno.getModalidadEstudio());
                    System.out.println("Cantidad de Asignaturas: " + diseno.getCantidadAsignaturas());
                    System.out.println("Serial: " + diseno.getSerial());
                    System.out.println("-------------------");
                }
            }
            System.out.println("Estudiantes de Ingeniería:");
            LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria = estudiante.getEstudiantesIngenieria();
            if (estudiantesIngenieria != null) {
                for (ObjEstudiante_Ingenieria ingenieria : estudiantesIngenieria) {
                    System.out.println("Cédula: " + ingenieria.getCedula());
                    System.out.println("Nombre: " + ingenieria.getNombre());
                    System.out.println("Apellido: " + ingenieria.getApellido());
                    System.out.println("Teléfono: " + ingenieria.getTelefono());
                    System.out.println("Número de Semestre: " + ingenieria.getNumeroSemestre());
                    System.out.println("Promedio Acumulado: " + ingenieria.getPromedioAcumulado());
                    System.out.println("Serial: " + ingenieria.getSerial());
                    System.out.println("-------------------");
                }
            }
        }
    }
}
