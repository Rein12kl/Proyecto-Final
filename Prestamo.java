
public class Prestamo {
    private Estudiantes estudiante;
    private Inventario inventario;
    private String fechaPrestamo;
    private String fechaDevolucion;
    
    public Estudiantes getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }
    public Inventario getInventario() {
        return inventario;
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }


}
