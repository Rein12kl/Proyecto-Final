import java.util.LinkedList;

public class Estudiantes {
    private LinkedList<ObjEstudiante_Diseno> estudiantesDiseno;
    private LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria;
    
    public Estudiantes() {
        this.estudiantesDiseno = new LinkedList<>();
        this.estudiantesIngenieria = new LinkedList<>();
    }
    
    public LinkedList<ObjEstudiante_Diseno> getEstudiantesDiseno() {
        return estudiantesDiseno;
    }
    public void setEstudiantesDiseno(LinkedList<ObjEstudiante_Diseno> estudiantesDiseno) {
        this.estudiantesDiseno = estudiantesDiseno;
    }
    public LinkedList<ObjEstudiante_Ingenieria> getEstudiantesIngenieria() {
        return estudiantesIngenieria;
    }
    public void setEstudiantesIngenieria(LinkedList<ObjEstudiante_Ingenieria> estudiantesIngenieria) {
        this.estudiantesIngenieria = estudiantesIngenieria;
    }
    
}
