import java.util.LinkedList;

public class Inventario {
    private LinkedList<ObjComputador_Portatil> lista_computadores;
    private LinkedList<ObjTableta_Grafica> lista_impresoras;
    
    public LinkedList<ObjComputador_Portatil> getLista_computadores() {
        return lista_computadores;
    }
    public void setLista_computadores(LinkedList<ObjComputador_Portatil> lista_computadores) {
        this.lista_computadores = lista_computadores;
    }
    public LinkedList<ObjTableta_Grafica> getLista_impresoras() {
        return lista_impresoras;
    }
    public void setLista_impresoras(LinkedList<ObjTableta_Grafica> lista_impresoras) {
        this.lista_impresoras = lista_impresoras;
    }
    
}
