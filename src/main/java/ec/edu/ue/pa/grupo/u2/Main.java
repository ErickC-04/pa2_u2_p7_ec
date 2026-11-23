
package ec.edu.ue.pa.grupo.u2;

import ec.edu.ue.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    public static void main(final String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("Hello Quarkus!");

        // CREATE
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.0);

        this.pedidoService.guardar(pedido);

        System.out.println("Pedido guardado: " + pedido);

        // READ
        Pedido pedido2 = this.pedidoService.buscarPorId(pedido.getId());

        if (pedido2 != null) {
            System.out.println("Pedido encontrado: " + pedido2);

            // UPDATE
            System.out.println("Valor anterior: " + pedido2.getPrecio());

            pedido2.setPrecio(200.0);
            this.pedidoService.actualizar(pedido2);

            Pedido pedido3 = this.pedidoService.buscarPorId(pedido2.getId());
            System.out.println("Pedido actualizado: " + pedido3);

            // DELETE
            this.pedidoService.eliminar(pedido2.getId());

            System.out.println("Pedido eliminado correctamente.");

        } else {
            System.out.println("No se encontró el pedido.");
        }

        return 0;
    }
}
