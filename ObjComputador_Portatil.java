
public class ObjComputador_Portatil {

    private String Serial;
    private String Marca;
    private float Tamano; // especificar que sea en pulgadas
    private float Precio;
    private String SistemaOperativo; // crear un metodo para escoger entre W7, W10 o W11
    private String Procesador; // crear metodo para escoger entre AMD Ryzen o Intel Core i5
    private boolean prestado;

    public ObjComputador_Portatil() {
    }
    public ObjComputador_Portatil(String serial, String marca, float tamano, float precio, String sistemaOperativo,
            String procesador) {
        Serial = serial;
        Marca = marca;
        Tamano = tamano;
        Precio = precio;
        SistemaOperativo = sistemaOperativo;
        Procesador = procesador;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public float getTamano() {
        return Tamano;
    }
    public void setTamano(float tamano) {
        Tamano = tamano;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }
    public String getSistemaOperativo() {
        return SistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }
    public String getProcesador() {
        return Procesador;
    }
    public void setProcesador(String procesador) {
        Procesador = procesador;
    }
    public boolean isPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


}
