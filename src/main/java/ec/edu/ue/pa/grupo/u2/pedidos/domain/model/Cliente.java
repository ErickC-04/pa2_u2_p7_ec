
package ec.edu.ue.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @SequenceGenerator(name = "cliente_seq",sequenceName = "cliente_seq_db",allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE,generator = "cliente_seq")
    @Column(name = "clie_id")
    private Integer id;

    @Column(name = "clie_nombre")
    private String nombre;

    @Column(name = "clie_apellido")
    private String apellido;

    @Column(name = "clie_correo")
    private String correo;

    @Column(name = "clie_telefono")
    private String telefono;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido,
                   String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
