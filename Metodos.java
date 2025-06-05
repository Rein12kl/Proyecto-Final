import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    
    /**
     * Agrega estudiantes a la lista, preguntando si es de diseño o ingeniería y validando los datos.
     */
    public LinkedList<Estudiantes> IngresarEstudiante(LinkedList<Estudiantes> estudiantes) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("");
            System.out.println("¿Qué tipo de estudiante desea ingresar?");
            System.out.println("1. Estudiante de Diseño");
            System.out.println("2. Estudiante de Ingeniería");
            System.out.println(""); 
            int tipo = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                System.out.println("");
                if (sc.hasNextInt()) {
                    tipo = sc.nextInt();
                    if (tipo == 1 || tipo == 2) {
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

            Estudiantes nuevoEstudiante = new Estudiantes();
            if (tipo == 1) {
                ObjEstudiante_Diseño estudianteDiseno = new ObjEstudiante_Diseño();
                String cedula;
                while (true) {
                System.out.print("Ingrese cédula: ");
                    cedula = sc.next();
                    if (ValidarCaracteresEspeciales(cedula)) {
                        estudianteDiseno.setCedula(cedula);
                        break;
                    } else {
                        System.out.println("La cédula no debe contener caracteres especiales.");
                    }
                }
                String nombre;
                while (true) {
                System.out.print("Ingrese nombre: ");
                    nombre = sc.next();
                    if (ValidarCaracteresEspeciales(nombre) && ValidarNumeros(nombre)) {
                        estudianteDiseno.setNombre(nombre);
                        break;
                    } else {
                        System.out.println("El nombre no debe contener caracteres especiales.");
                    }
                }
                String apellido;
                while (true) {
                System.out.print("Ingrese apellido: ");
                    apellido = sc.next();
                    if (ValidarCaracteresEspeciales(apellido) && ValidarNumeros(apellido)) {
                        estudianteDiseno.setApellido(apellido);
                        break;
                    } else {
                        System.out.println("El apellido no debe contener caracteres especiales.");
                    }
                }
                String telefono;
                while (true) {
                System.out.print("Ingrese teléfono: ");
                    telefono = sc.next();
                    if (ValidarCaracteresEspeciales(telefono)) {
                        estudianteDiseno.setTelefono(telefono);
                        break;
                    } else {
                        System.out.println("El teléfono no debe contener caracteres especiales.");
                    }
                }

                System.out.print("Ingrese modalidad de estudio (virtual/presencial): ");
                String ModalidadEstudio = "";
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
                estudianteDiseno.setCantidadAsignaturas(CantidadAsignatura);

                int Serial;
                while (true) {
                System.out.print("Ingrese serial: ");
                    String serialInput = sc.next();
                    if (ValidarCaracteresEspeciales(serialInput)) {
                        try {
                            Serial = Integer.parseInt(serialInput);
                            estudianteDiseno.setSerial(Serial);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("El serial debe ser un número entero válido.");
                        }
                    } else {
                        System.out.println("El serial no debe contener caracteres especiales.");
                    }
                }
                estudianteDiseno.setEnPrestamo(false);
                LinkedList<ObjEstudiante_Diseño> listaDiseno = nuevoEstudiante.getEstudiantesDiseno();
                if (listaDiseno == null) {
                    listaDiseno = new LinkedList<>();
                }
                listaDiseno.add(estudianteDiseno);
                nuevoEstudiante.setEstudiantesDiseno(listaDiseno);
                System.out.println("Estudiante de Diseño ingresado exitosamente.");
            } else if (tipo == 2) {
                ObjEstudiante_Ingenieria estudianteIngenieria = new ObjEstudiante_Ingenieria();
                String cedula;
                while (true) {
                System.out.print("Ingrese cédula: ");
                    cedula = sc.next();
                    if (ValidarCaracteresEspeciales(cedula)) {
                        estudianteIngenieria.setCedula(cedula);
                        break;
                    } else {
                        System.out.println("La cédula no debe contener caracteres especiales.");
                    }
                }
                String nombre;
                while (true) {
                System.out.print("Ingrese nombre: ");
                    nombre = sc.next();
                    if (ValidarCaracteresEspeciales(nombre) && ValidarNumeros(nombre)) {
                        estudianteIngenieria.setNombre(nombre);
                        break;
                    } else {
                        System.out.println("El nombre no debe contener caracteres especiales.");
                    }
                }
                String apellido;
                while (true) {
                System.out.print("Ingrese apellido: ");
                    apellido = sc.next();
                    if (ValidarCaracteresEspeciales(apellido) && ValidarNumeros(apellido)) {
                        estudianteIngenieria.setApellido(apellido);
                        break;
                    } else {
                        System.out.println("El apellido no debe contener caracteres especiales.");
                    }
                }
                String telefono;
                while (true) {
                System.out.print("Ingrese teléfono: ");
                    telefono = sc.next();
                    if (ValidarCaracteresEspeciales(telefono)) {
                        estudianteIngenieria.setTelefono(telefono);
                        break;
                    } else {
                        System.out.println("El teléfono no debe contener caracteres especiales.");
                    }
                }

                System.out.print("Ingrese número de semestre: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un semestre válido.");
                    sc.next();
                }
                int NumeroSemestre = sc.nextInt();
                estudianteIngenieria.setNumeroSemestre(NumeroSemestre);

                System.out.print("Ingrese promedio acumulado: ");
                while (!sc.hasNextFloat()) {
                    System.out.print("Ingrese un promedio válido.");
                    sc.next();
                }
                float PromedioAcumulado = sc.nextFloat();
                estudianteIngenieria.setPromedioAcumulado(PromedioAcumulado);

                String Serial;
                while (true) {
                System.out.print("Ingrese serial: ");
                    Serial = sc.next();
                    if (ValidarCaracteresEspeciales(Serial)) {
                        estudianteIngenieria.setSerial(Serial);
                        break;
                    } else {
                        System.out.println("El serial no debe contener caracteres especiales.");
                    }
                }
                estudianteIngenieria.setEnPrestamo(false);

                LinkedList<ObjEstudiante_Ingenieria> listaIngenieria = nuevoEstudiante.getEstudiantesIngenieria();
                if (listaIngenieria == null) {
                    listaIngenieria = new LinkedList<>();
                }
                listaIngenieria.add(estudianteIngenieria);
                nuevoEstudiante.setEstudiantesIngenieria(listaIngenieria);
                System.out.println("Estudiante de Ingeniería ingresado exitosamente.");
            } else {
                System.out.println("Opción no válida.");
            }
            sc.nextLine(); // Limpiar el salto de línea pendiente
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
            estudiantes.add(nuevoEstudiante);
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        return estudiantes;
    }

    /**
     * Permite ingresar equipos al inventario, ya sea computador portátil o tableta gráfica, validando los datos.
     */
    public LinkedList<Inventario> IngresarInventario(LinkedList<Inventario> inventarios) {
      
        boolean continuar = true;
        while (continuar) {
            Inventario inventario = new Inventario();
            System.out.println("¿Qué tipo de equipo desea ingresar?");
            System.out.println("1. Computador Portátil");
            System.out.println("2. Tableta Gráfica");
            int tipo = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                if (sc.hasNextInt()) {
                    tipo = sc.nextInt();
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
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un serial válido.");
                    sc.next();
                }
                String Serial = sc.next();
                computador.setSerial(Serial);
                
                System.out.print("Ingrese marca: ");
                String Marca = sc.next();
                computador.setMarca(Marca);

                System.out.print("Ingrese tamaño (pulgadas): ");
                while (true) {
                    while (!sc.hasNextFloat()) {
                        System.out.print("Ingrese un tamaño válido.");
                        sc.next();
                    }
                    float Tamano = sc.nextFloat();
                    if (Tamano >= 11 && Tamano <= 18) {
                        computador.setTamano(Tamano);
                        break;
                    } else {
                        System.out.println("El tamaño debe estar entre 11 y 18 pulgadas.");
                    }
                }

                System.out.print("Ingrese precio: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un precio válido.");
                    sc.next();
                }
                float Precio = sc.nextFloat();
                computador.setPrecio(Precio);
                
                String sistemaOperativo = "";
                while (true) {
                    System.out.print("Seleccione un sistema operativo");
                    System.out.println("1. Windows 7 (W7)");
                    System.out.println("2. Windows 10 (W10)");
                    System.out.println("3. Windows 11 (W11)");
                    if (sc.hasNextInt()) {
                        int opcion = sc.nextInt();
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
                computador.setPrestado(false);
                computador.setProcesador(procesador);

                LinkedList<ObjComputador_Portatil> listaComputadores = inventario.getLista_computadores();
                if (listaComputadores == null) {
                    listaComputadores = new LinkedList<>();
                }
                listaComputadores.add(computador);
                inventario.setLista_computadores(listaComputadores);
                System.out.println("Computador Portátil ingresado exitosamente.");
                inventarios.add(inventario);
            } else if (tipo == 2) {
                ObjTableta_Grafica tableta = new ObjTableta_Grafica();
                System.out.print("Ingrese serial: ");
                String Serial = sc.next();
                tableta.setSerial(Serial);

                System.out.print("Ingrese marca: ");
              
                String Marca = sc.next();
                tableta.setMarca(Marca);

                System.out.print("Ingrese tamaño (pulgadas): ");
                while (true) {
                    while (!sc.hasNextFloat()) {
                        System.out.print("Ingrese un tamaño válido.");
                        sc.next();
                    }
                    float Tamano = sc.nextFloat();
                    if (Tamano >= 5 && Tamano <= 13) {
                        tableta.setTamano(Tamano);
                        break;
                    } else {
                        System.out.println("El tamaño debe estar entre 5 y 13 pulgadas.");
                    }
                }

                System.out.print("Ingrese precio: ");
                while (!sc.hasNextFloat()) {
                    System.out.print("Ingrese un precio válido.");
                    sc.next();
                }
                float Precio = sc.nextFloat();
                tableta.setPrecio(Precio);

                System.out.print("Seleccione un almacenamiento");
                int almacenamiento = 0;
                while (true) {
                    System.out.println("1. 256 GB");
                    System.out.println("2. 512 GB");
                    System.out.println("3. 1024 GB");
                
                    if (sc.hasNextInt()) {
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
                    } else {
                    System.out.println("Entrada inválida. Debe ingresar una opción válida.");
                    sc.next(); 
                } 
                tableta.setAlmacenamiento(almacenamiento);

                }

                System.out.print("Ingrese peso (kg): ");
                while (true) {
                    while (!sc.hasNextFloat()) {
                        System.out.print("Ingrese un peso válido.");
                        sc.next();
                    }
                    float Peso = sc.nextFloat();
                    if (Peso >= 0 && Peso <= 3) {
                        tableta.setPeso(Peso);
                        break;
                    } else {
                        System.out.println("El peso debe estar entre 0 y 3 kg.");
                    }
                }

                tableta.setPrestado(false);
                LinkedList<ObjTableta_Grafica> listaTabletas = inventario.getLista_impresoras();
                if (listaTabletas == null) {
                    listaTabletas = new LinkedList<>();
                }
                listaTabletas.add(tableta);
                inventario.setLista_impresoras(listaTabletas);
                System.out.println("Tableta Gráfica ingresada exitosamente.");
                inventarios.add(inventario);
            } else if (tipo == 2) {
                System.out.println("Opción no válida.");
            }


            sc.nextLine(); // Limpiar el salto de línea pendiente
            System.out.print("¿Desea ingresar otro equipo? (s/n): ");
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
        return inventarios;
    }

    /**
     * Registra un préstamo de equipo a un estudiante, validando disponibilidad de inventario y estudiantes.
     */
    public LinkedList<Prestamo> RegistrarPrestamoEquipo(LinkedList<Inventario> inventarios, LinkedList<Estudiantes> estudiantes) {
        boolean continuar = true;
        LinkedList<Prestamo> prestamos = new LinkedList<>();
        while (continuar) {
            // Imprimir inventario y estudiantes disponibles
            ImprimirInventarioDisponible(inventarios);
            ImprimirEstudiantesDisponibles(estudiantes);

            // Validar si hay inventario o estudiantes disponibles
            boolean hayInventario = false;
            for (Inventario inventario : inventarios) {
                LinkedList<ObjComputador_Portatil> computadores = inventario.getLista_computadores();
                if (computadores != null) {
                    for (ObjComputador_Portatil computador : computadores) {
                        if (!computador.isPrestado()) {
                            hayInventario = true;
                            break;
                        }
                    }
                }
                LinkedList<ObjTableta_Grafica> tabletas = inventario.getLista_impresoras();
                if (tabletas != null) {
                    for (ObjTableta_Grafica tableta : tabletas) {
                        if (!tableta.isPrestado()) {
                            hayInventario = true;
                            break;
                        }
                    }
                }
                if (hayInventario) break;
            }
            boolean hayEstudiante = false;
            for (Estudiantes estudiante : estudiantes) {
                LinkedList<ObjEstudiante_Diseño> disenos = estudiante.getEstudiantesDiseno();
                if (disenos != null) {
                    for (ObjEstudiante_Diseño diseno : disenos) {
                        if (!diseno.isEnPrestamo()) {
                            hayEstudiante = true;
                            break;
                        }
                    }
                }
                LinkedList<ObjEstudiante_Ingenieria> ingenierias = estudiante.getEstudiantesIngenieria();
                if (ingenierias != null) {
                    for (ObjEstudiante_Ingenieria ingenieria : ingenierias) {
                        if (!ingenieria.isEnPrestamo()) {
                            hayEstudiante = true;
                            break;
                        }
                    }
                }
                if (hayEstudiante) break;
            }
            if (!hayInventario || !hayEstudiante) {
                System.out.println("No se puede realizar el préstamo porque no hay estudiantes o inventario disponible.");
                break;
            }

            System.out.println("¿Qué tipo de estudiante desea registrar para el préstamo?");
            System.out.println("1. Estudiante de Diseño");
            System.out.println("2. Estudiante de Ingeniería");
            int tipoEstudiante = 0;
            while (true) {
                System.out.print("Seleccione una opción: ");
                if (sc.hasNextInt()) {
                    tipoEstudiante = sc.nextInt();
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
                    LinkedList<ObjEstudiante_Diseño> disenos = estudiante.getEstudiantesDiseno();
                    if (disenos != null) {
                        for (ObjEstudiante_Diseño diseno : disenos) {
                        if (diseno.getCedula().equals(cedula)) {
                                diseno.setEnPrestamo(true);
                            estudianteObj = estudiante;
                            break;
                            }
                        }
                    }
                } else {
                    LinkedList<ObjEstudiante_Ingenieria> ingenierias = estudiante.getEstudiantesIngenieria();
                    if (ingenierias != null) {
                        for (ObjEstudiante_Ingenieria ingenieria : ingenierias) {
                        if (ingenieria.getCedula().equals(cedula)) {
                                ingenieria.setEnPrestamo(true);
                            estudianteObj = estudiante;
                            break;
                            }
                        }
                    }
                }
                if (estudianteObj != null)
                    break;
            }

            // Buscar el inventario por serial
            for (Inventario inventario : inventarios) {
                if (tipoEquipo == 1) {
                    LinkedList<ObjComputador_Portatil> computadores = inventario.getLista_computadores();
                    if (computadores != null) {
                        for (ObjComputador_Portatil computador : computadores) {
                        if (computador.getSerial().equals(serial)) {
                                computador.setPrestado(true);
                            inventarioObj = inventario;
                            break;
                            }
                        }
                    }
                } else {
                    LinkedList<ObjTableta_Grafica> tabletas = inventario.getLista_impresoras();
                    if (tabletas != null) {
                        for (ObjTableta_Grafica tableta : tabletas) {
                        if (tableta.getSerial().equals(serial)) {
                            inventarioObj = inventario;
                            break;
                            }
                        }
                    }
                }
                if (inventarioObj != null)
                    break;
            }

            if (estudianteObj != null && inventarioObj != null) {
                prestamo.setEstudiante(estudianteObj);
                prestamo.setInventario(inventarioObj);
                // Marcar estudiante e inventario como en préstamo/prestado
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
            prestamos.add(prestamo);
        }
        return prestamos;
    }

    /**
     * Permite modificar los datos de un préstamo existente (fecha de préstamo o devolución).
     */
    public LinkedList<Prestamo> ModificarPrestamoEquipo(LinkedList<Prestamo> prestamos) {
        System.out.println("\n=== MODIFICAR PRÉSTAMO DE EQUIPO ===");
        
        // Mostrar préstamos existentes
        System.out.println("Préstamos actuales:");
        MostrarPrestamos(prestamos);
        
        System.out.println("\n¿Cómo desea buscar el préstamo a modificar?");
        System.out.println("1. Por cédula del estudiante");
        System.out.println("2. Por serial del equipo");
        
        int opcionBusqueda = 0;
        while (true) {
            System.out.print("Seleccione una opción: ");
            if (sc.hasNextInt()) {
                opcionBusqueda = sc.nextInt();
                if (opcionBusqueda == 1 || opcionBusqueda == 2) {
                    break;
                } else {
                    System.out.println("Opción no válida. Debe ser 1 o 2.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.next();
            }
        }

        String busqueda = "";
        if (opcionBusqueda == 1) {
            System.out.print("Ingrese la cédula del estudiante: ");
            busqueda = sc.nextLine();
        } else {
            System.out.print("Ingrese el serial del equipo: ");
            busqueda = sc.nextLine();
        }

        Prestamo prestamoEncontrado = BuscarEquipo(prestamos, opcionBusqueda, busqueda);
        
        if (prestamoEncontrado == null) {
            System.out.println("No se encontró el préstamo con los datos proporcionados.");
            return prestamos;
        }
    
        System.out.println("\nDatos actuales del préstamo:");

        System.out.println("\n¿Qué desea modificar?");
        System.out.println("1. Fecha de préstamo");
        System.out.println("2. Fecha de devolución");
        System.out.println("3. Cancelar modificación");

        int opcionModificacion = 0;
        while (true) {
            System.out.print("Seleccione una opción: ");
            if (sc.hasNextInt()) {
                opcionModificacion = sc.nextInt();
                if (opcionModificacion >= 1 && opcionModificacion <= 4) {
                    break;
                } else {
                    System.out.println("Opción no válida. Debe ser un número entre 1 y 4.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.next();
            }
        }

        switch (opcionModificacion) {
            case 1:
                System.out.print("Ingrese la nueva fecha de préstamo (dd/mm/yyyy): ");
                String nuevaFechaPrestamo = sc.nextLine();
                prestamoEncontrado.setFechaPrestamo(nuevaFechaPrestamo);
                System.out.println("Fecha de préstamo actualizada exitosamente.");
                break;
            case 2:
                System.out.print("Ingrese la nueva fecha de devolución (dd/mm/yyyy): ");
                String nuevaFechaDevolucion = sc.nextLine();
                prestamoEncontrado.setFechaDevolucion(nuevaFechaDevolucion);
                System.out.println("Fecha de devolución actualizada exitosamente.");
                break;
          
            case 3:
                System.out.println("Modificación cancelada.");
                break;
        }
        prestamos.add(prestamoEncontrado);
        return prestamos;
    }

    /**
     * Muestra por consola todos los préstamos registrados.
     */
    public void MostrarPrestamos(LinkedList<Prestamo> prestamos) {
        System.out.println("Préstamos actuales:");
        if (prestamos == null || prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }
        for (Prestamo prestamo : prestamos) {
            System.out.println("Estudiante: " + prestamo.getEstudiante());
            System.out.println("Equipo: " + prestamo.getInventario());
            System.out.println("-------------------");
        }
    }

    /**
     * Permite registrar la devolución de un equipo, eliminando el préstamo correspondiente.
     */
    public LinkedList<Prestamo> DevolucionEquipo(LinkedList<Prestamo> prestamos) {
        System.out.println("\n=== DEVOLUCIÓN DE EQUIPO ===");
        System.out.println("Préstamos actuales:");
        MostrarPrestamos(prestamos);

        System.out.println("\n¿Cómo desea buscar el préstamo a devolver?");
        System.out.println("1. Por cédula del estudiante");
        System.out.println("2. Por serial del equipo");

        int opcionBusqueda = 0;
        while (true) {
            System.out.print("Seleccione una opción: ");
            if (sc.hasNextInt()) {
                opcionBusqueda = sc.nextInt();
                if (opcionBusqueda == 1 || opcionBusqueda == 2) {
                    break;
                } else {
                    System.out.println("Opción no válida. Debe ser 1 o 2.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.next();
            }
        }
        String busqueda = "";
        if (opcionBusqueda == 1) {
            System.out.print("Ingrese la cédula del estudiante: ");
            busqueda = sc.nextLine();
        } else {
            System.out.print("Ingrese el serial del equipo: ");
            busqueda = sc.nextLine();
        }

        Prestamo prestamoEncontrado = BuscarEquipo(prestamos, opcionBusqueda, busqueda);

        if (prestamoEncontrado == null) {
            System.out.println("No se encontró el préstamo con los datos proporcionados.");
        } else {
            // Marcar estudiante como disponible
            Estudiantes estudiante = prestamoEncontrado.getEstudiante();
            if (estudiante != null) {
                LinkedList<ObjEstudiante_Diseño> disenos = estudiante.getEstudiantesDiseno();
                if (disenos != null) {
                    for (ObjEstudiante_Diseño diseno : disenos) {
                        if (diseno.getCedula().equals(busqueda)) {
                            diseno.setEnPrestamo(false);
                        }
                    }
                }
                LinkedList<ObjEstudiante_Ingenieria> ingenierias = estudiante.getEstudiantesIngenieria();
                if (ingenierias != null) {
                    for (ObjEstudiante_Ingenieria ing : ingenierias) {
                        if (ing.getCedula().equals(busqueda)) {
                            ing.setEnPrestamo(false);
                        }
                    }
                }
            }
            // Marcar inventario como disponible
            Inventario inventario = prestamoEncontrado.getInventario();
            if (inventario != null) {
                LinkedList<ObjComputador_Portatil> computadores = inventario.getLista_computadores();
                if (computadores != null) {
                    for (ObjComputador_Portatil comp : computadores) {
                        if (comp.getSerial().equals(busqueda)) {
                            comp.setPrestado(false);
                        }
                    }
                }
                LinkedList<ObjTableta_Grafica> tabletas = inventario.getLista_impresoras();
                if (tabletas != null) {
                    for (ObjTableta_Grafica tab : tabletas) {
                        if (tab.getSerial().equals(busqueda)) {
                            tab.setPrestado(false);
                        }
                    }
                }
            }
            System.out.println("Se registró devolución de equipo a estudiante.");
        }
        return prestamos;
    }

    /**
     * Busca un préstamo en la lista según cédula de estudiante o serial de equipo.
     */
    public Prestamo BuscarEquipo(LinkedList<Prestamo> prestamos, int opcionBusqueda, String busqueda) {
        Prestamo prestamoEncontrado = null;
        for (Prestamo prestamo : prestamos) {
            if (opcionBusqueda == 1) {
                Estudiantes estudiante = prestamo.getEstudiante();
                if (estudiante != null) {
                    LinkedList<ObjEstudiante_Diseño> disenos = estudiante.getEstudiantesDiseno();
                    if (disenos != null) {
                        for (ObjEstudiante_Diseño diseno : disenos) {
                            if (diseno.getCedula().equals(busqueda)) {
                                prestamoEncontrado = prestamo;
                                break;
                            }
                        }
                    }
                    LinkedList<ObjEstudiante_Ingenieria> ingenierias = estudiante.getEstudiantesIngenieria();
                    if (ingenierias != null) {
                        for (ObjEstudiante_Ingenieria ing : ingenierias) {
                            if (ing.getCedula().equals(busqueda)) {
                                prestamoEncontrado = prestamo;
                                break;
                            }
                        }
                    }
                }
            } else {
                Inventario inventario = prestamo.getInventario();
                if (inventario != null) {
                    for (ObjComputador_Portatil comp : inventario.getLista_computadores()) {
                        if (comp.getSerial().equals(busqueda)) {
                            prestamoEncontrado = prestamo;
                            break;
                        }
                    }
                    for (ObjTableta_Grafica tab : inventario.getLista_impresoras()) {
                        if (tab.getSerial().equals(busqueda)) {
                            prestamoEncontrado = prestamo;
                            break;
                        }
                    }
                }
            }
            if (prestamoEncontrado != null) {
                prestamos.remove(prestamoEncontrado); // Elimina el préstamo de la lista
                break;
            }
        }
        return prestamoEncontrado;
    }

    /**
     * Imprime todo el inventario registrado (computadores y tabletas), sin filtrar por disponibilidad.
     */
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
    /**
     * Imprime solo los equipos disponibles para préstamo (no prestados).
     */
    public void ImprimirInventarioDisponible(LinkedList<Inventario> inventarios) {
        if (inventarios == null || inventarios.isEmpty()) {
            System.out.println("No hay inventario para imprimir.");
            return;
        }
        System.out.println("------INVENTARIO-------");
        System.out.println("Computadores Portátiles:");
        // Imprimir todos los computadores portátiles disponibles
        for (Inventario inventario : inventarios) {
            LinkedList<ObjComputador_Portatil> computadores = inventario.getLista_computadores();
            if (computadores != null) {
                for (ObjComputador_Portatil computador : computadores) {
                    if (!computador.isPrestado()) {
                        System.out.println("Serial: " + computador.getSerial());
                        System.out.println("Marca: " + computador.getMarca());
                        System.out.println("Tamaño: " + computador.getTamano() + " pulgadas");
                        System.out.println("Precio: " + computador.getPrecio());
                        System.out.println("Sistema Operativo: " + computador.getSistemaOperativo());
                        System.out.println("Procesador: " + computador.getProcesador());
                        System.out.println("-------------------");
                    }
                }
            }
        }
        System.out.println("Tabletas Gráficas:");
        // Imprimir todas las tabletas gráficas disponibles
        for (Inventario inventario : inventarios) {
            LinkedList<ObjTableta_Grafica> tabletas = inventario.getLista_impresoras();
            if (tabletas != null) {
                for (ObjTableta_Grafica tableta : tabletas) {
                    if (!tableta.isPrestado()) {
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
    }

    /**
     * Imprime todos los estudiantes registrados (de diseño e ingeniería).
     */
    public void ImprimirEstudiantes(LinkedList<Estudiantes> estudiantes) {
        if (estudiantes == null || estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para imprimir.");
            return;
        }
        System.out.println("--- ESTUDIANTES ---");
        System.out.println("Estudiantes de Diseño:");
        boolean hayDiseno = false;
        for (Estudiantes estudiante : estudiantes) {
            LinkedList<ObjEstudiante_Diseño> estudiantesDiseno = estudiante.getEstudiantesDiseno();
            if (estudiantesDiseno != null) {
                for (ObjEstudiante_Diseño diseno : estudiantesDiseno) {
                    hayDiseno = true;
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
        }
        if (!hayDiseno) {
            System.out.println("No hay estudiantes de Diseño.");
        }
        System.out.println("Estudiantes de Ingeniería:");
        boolean hayIng = false;
        for (Estudiantes estudiante : estudiantes) {
            LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria = estudiante.getEstudiantesIngenieria();
            if (estudiantesIngenieria != null) {
                for (ObjEstudiante_Ingenieria ingenieria : estudiantesIngenieria) {
                    hayIng = true;
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
        if (!hayIng) {
            System.out.println("No hay estudiantes de Ingeniería.");
        }
    }

    /**
     * Imprime solo los estudiantes que no tienen préstamo activo.
     */
    public void ImprimirEstudiantesDisponibles(LinkedList<Estudiantes> estudiantes) {
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
                    if (!diseno.isEnPrestamo()) {
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
            }
            System.out.println("Estudiantes de Ingeniería:");
            LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria = estudiante.getEstudiantesIngenieria();
            if (estudiantesIngenieria != null) {
                for (ObjEstudiante_Ingenieria ingenieria : estudiantesIngenieria) {
                    if (!ingenieria.isEnPrestamo()) {
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

    /**
     * Valida que una cadena no tenga caracteres especiales (solo letras y números).
     */
    public boolean ValidarCaracteresEspeciales(String cadena){
        return cadena.matches("[a-zA-Z0-9]+");
    }

    /**
     * Valida que una cadena solo tenga letras (sin números ni caracteres especiales).
     */
    public boolean ValidarNumeros(String cadena){
        return cadena.matches("[a-zA-Z]+");
    }
}
