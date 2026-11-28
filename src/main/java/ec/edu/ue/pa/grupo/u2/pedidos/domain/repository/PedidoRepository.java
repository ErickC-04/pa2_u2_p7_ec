package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    // create
    public void create(Pedido pedido);

    // update
    public Optional<Pedido> read(Integer id);

    public Optional<Pedido> readByNumber(String numero);

    public List<Pedido> readAll();

    public Optional<Pedido> readByNumberNative(String numero);

    public List<Pedido> readAllNative();

    // read
    public void update(Pedido pedido);

    // delete
    public void delete(Integer id);

}
