
package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @SequenceGenerator(name = "pago_seq",sequenceName = "pago_seq_db",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pago_seq")
    @Column(name = "pago_id")
    private Integer id;

    @Column(name = "pago_pedido_id")
    private Integer pedidoId;

    @Column(name = "pago_monto")
    private Double monto;

    @Column(name = "pago_metodo")
    private String metodoPago;

    @Column(name = "pago_estado")
    private String estado;

    public Pago() {
    }

    public Pago(Integer id, Integer pedidoId, Double monto,
                String metodoPago, String estado) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
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
