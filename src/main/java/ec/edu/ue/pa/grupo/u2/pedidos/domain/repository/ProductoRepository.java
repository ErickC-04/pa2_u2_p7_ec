package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

    public void create(Producto producto);

    public Producto read(Integer id);

    public void update(Producto producto);

    public void delete(Integer id);

}