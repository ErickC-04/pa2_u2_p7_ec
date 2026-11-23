
package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Envio;

public interface EnvioRepository {

    // create
    public void create(Envio envio);

    // read
    public Envio read(Integer id);

    // update
    public void update(Envio envio);

    // delete
    public void delete(Integer id);
}
