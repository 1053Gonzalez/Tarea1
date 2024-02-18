package alquilerVehiculos;

public class Vehiculo {

    private String numeroPlaca;
    private String tipo;
    private String marca;
    private String modelo;
    private String estado;
    private int pma;
    
    //clase constructora de objetos vehiculo.

    public Vehiculo(String numeroPlaca, String tipo, String marca, String modelo, String estado, int pma) {
        this.numeroPlaca = numeroPlaca;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.pma = pma;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getpma() {
        return pma;
    }

    public void setpma(int pma) {
        this.pma = pma;
    }
}
