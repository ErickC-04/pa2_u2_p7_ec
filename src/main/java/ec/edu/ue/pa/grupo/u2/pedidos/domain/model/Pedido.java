package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

public class Pedido {


 private String id;
    private String producto;
    private double precio;
    private int cantidad;
    private String estado;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
