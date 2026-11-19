package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    // create 
    public void create(Pedido pedido) ;
    //update
    public Pedido read(Integer id);
    //read 
    public void update (Pedido pedido) ;
    //delete
    public void delete (Integer id );
    

}
