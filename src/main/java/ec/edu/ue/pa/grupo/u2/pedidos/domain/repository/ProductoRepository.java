
package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

    // create
    public void create(Producto producto);

    // read
    public Producto read(Integer id);

    // update
    public void update(Producto producto);

    // delete
    public void delete(Integer id);
}
