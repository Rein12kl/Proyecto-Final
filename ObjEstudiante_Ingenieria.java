public class ObjEstudiante_Ingenieria {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int NumeroSemestre;
    private float PromedioAcumulado;
    private String Serial;
    public ObjEstudiante_Ingenieria() {
    }
    public ObjEstudiante_Ingenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre,
            float promedioAcumulado, String serial) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        NumeroSemestre = numeroSemestre;
        PromedioAcumulado = promedioAcumulado;
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
    public int getNumeroSemestre() {
        return NumeroSemestre;
    }
    public void setNumeroSemestre(int numeroSemestre) {
        NumeroSemestre = numeroSemestre;
    }
    public float getPromedioAcumulado() {
        return PromedioAcumulado;
    }
    public void setPromedioAcumulado(float promedioAcumulado) {
        PromedioAcumulado = promedioAcumulado;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }

    

}