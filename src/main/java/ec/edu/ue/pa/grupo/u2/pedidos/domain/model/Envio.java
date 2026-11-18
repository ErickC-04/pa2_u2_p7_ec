package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

public class Envio {

    private String id;
    private String pedidoId;
    private String direccion;
    private String ciudad;
    private String estado;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPedidoId() {
        return pedidoId;
    }
    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
