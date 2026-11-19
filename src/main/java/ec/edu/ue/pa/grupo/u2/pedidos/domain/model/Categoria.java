
package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @SequenceGenerator(name = "categoria_seq",sequenceName = "categoria_seq_db",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "categoria_seq")
    @Column(name = "cate_id")
    private Integer id;

    @Column(name = "cate_nombre")
    private String nombre;

    @Column(name = "cate_descripcion")
    private String descripcion;

    @Column(name = "cate_estado")
    private String estado;

    @Column(name = "cate_tipo")
    private String tipo;

    public Categoria() {
    }

    public Categoria(Integer id, String nombre, String descripcion,
                     String estado, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
