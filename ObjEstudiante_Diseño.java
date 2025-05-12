public class ObjEstudiante_Diseño{

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String ModalidadEstudio; //virtual o presencial
    private int CantidadAsignaturas;
    private int Serial;
    public ObjEstudiante_Diseño() {
    }
    public ObjEstudiante_Diseño(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio,
            int cantidadAsignaturas, int serial) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        ModalidadEstudio = modalidadEstudio;
        CantidadAsignaturas = cantidadAsignaturas;
        Serial = serial;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getModalidadEstudio() {
        return ModalidadEstudio;
    }
    public void setModalidadEstudio(String modalidadEstudio) {
        ModalidadEstudio = modalidadEstudio;
    }
    public int getCantidadAsignaturas() {
        return CantidadAsignaturas;
    }
    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        CantidadAsignaturas = cantidadAsignaturas;
    }
    public int getSerial() {
        return Serial;
    }
    public void setSerial(int serial) {
        Serial = serial;
    }


}