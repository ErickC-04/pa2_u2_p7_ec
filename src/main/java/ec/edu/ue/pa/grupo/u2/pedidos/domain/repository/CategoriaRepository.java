
package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Categoria;

public interface CategoriaRepository {

    // create
    public void create(Categoria categoria);

    // read
    public Categoria read(Integer id);

    // update
    public void update(Categoria categoria);

    // delete
    public void delete(Integer id);
}
