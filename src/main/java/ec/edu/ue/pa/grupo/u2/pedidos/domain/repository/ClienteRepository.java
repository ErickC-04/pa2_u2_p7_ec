package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    public void create(Cliente cliente);

    public Cliente read(Integer id);

    public void update(Cliente cliente);

    public void delete(Integer id);

}