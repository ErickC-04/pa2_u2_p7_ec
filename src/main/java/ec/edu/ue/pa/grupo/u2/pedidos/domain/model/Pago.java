package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

public class Pago {

    private String id;
    private String pedidoId;
    private double monto;
    private String metodoPago;
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
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
