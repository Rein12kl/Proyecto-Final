import java.util.LinkedList;

public class Estudiantes {
    private LinkedList<ObjEstudiante_Diseño> estudiantesDiseno;
    private LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria;
    
    public LinkedList<ObjEstudiante_Diseño> getEstudiantesDiseno() {
        return estudiantesDiseno;
    }
    public void setEstudiantesDiseno(LinkedList<ObjEstudiante_Diseño> estudiantesDiseno) {
        this.estudiantesDiseno = estudiantesDiseno;
    }
    public LinkedList<ObjEstudiante_Ingenieria> getEstudiantesIngenieria() {
        return estudiantesIngenieria;
    }
    public void setEstudiantesIngenieria(LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria) {
        this.estudiantesIngenieria = estudiantesIngenieria;
    }
    
}
