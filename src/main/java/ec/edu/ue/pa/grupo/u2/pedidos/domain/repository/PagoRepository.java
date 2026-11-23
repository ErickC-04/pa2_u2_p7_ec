
package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pago;

public interface PagoRepository {

    // create
    public void create(Pago pago);

    // read
    public Pago read(Integer id);

    // update
    public void update(Pago pago);

    // delete
    public void delete(Integer id);
}
