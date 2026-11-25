package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Categoria;

public interface CategoriaRepository {

    public void create(Categoria categoria);

    public Categoria read(Integer id);

    public void update(Categoria categoria);

    public void delete(Integer id);

}