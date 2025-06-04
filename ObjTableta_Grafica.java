
public class ObjTableta_Grafica {
    
    private String Serial;
    private String Marca;
    private float Tamano; //pulgadas
    private float Precio;
    private int Almacenamiento; //hay que hacer un método solo se puede 256 GB, 512 o 1 tb
    private float Peso; // se debe especificar que sea en kg
    private boolean Prestado;
    public ObjTableta_Grafica() {
    }
    public ObjTableta_Grafica(String serial, String marca, float tamano, float precio, int almacenamiento, float peso) {
        Serial = serial;
        Marca = marca;
        Tamano = tamano;
        Precio = precio;
        Almacenamiento = almacenamiento;
        Peso = peso;
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
    public int getAlmacenamiento() {
        return Almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento) {
        Almacenamiento = almacenamiento;
    }
    public float getPeso() {
        return Peso;
    }
    public void setPeso(float peso) {
        Peso = peso;
    }
    public boolean isPrestado() {
        return Prestado;    
    }
    public void setPrestado(boolean prestado) {
        Prestado = prestado;
    }

}
