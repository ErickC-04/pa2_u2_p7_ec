
package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "envios")
public class Envio {

    @Id
    @SequenceGenerator(name = "envio_seq",sequenceName = "envio_seq_db",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "envio_seq")
    @Column(name = "env_id")
    private Integer id;

    @Column(name = "env_pedido_id")
    private Integer pedidoId;

    @Column(name = "env_direccion")
    private String direccion;

    @Column(name = "env_ciudad")
    private String ciudad;

    @Column(name = "env_estado")
    private String estado;

    public Envio() {
    }

    public Envio(Integer id, Integer pedidoId, String direccion,
                 String ciudad, String estado) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.direccion = direccion;
        this.ciudad = ciudad;
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
