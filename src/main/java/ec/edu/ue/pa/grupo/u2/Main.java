package ec.edu.ue.pa.grupo.u2;

import ec.edu.ue.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main  implements  QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;
    public static void main(String[] args) {
        Quarkus.run(Main.class ,args);
    }

    @Override
    public int run(String... args) throws Exception {
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.00);
        this.pedidoService.guardar(pedido);
        System.out.println(" Hello , Quarkus!");
        return 0;
    }

}
