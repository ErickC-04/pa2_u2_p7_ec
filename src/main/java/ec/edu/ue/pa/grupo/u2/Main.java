package ec.edu.ue.pa.grupo.u2;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Envio;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pago;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Producto;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain 
public class Main  implements  QuarkusApplication{

    public static void main(String[] args) {
        Quarkus.run(Main.class ,args);
    }

    @Override
    public int run(String... args) throws Exception {
        
        
        // MODELO CLIENTE
    Cliente cliente = new Cliente();
    cliente.setId("C001");
    cliente.setNombre("Erick");
    cliente.setApellido("Capa");
    cliente.setCorreo("cliente@ejemplo.com");
    cliente.setTelefono("0999999999");

    // MODELO PRODUCTO
    Producto producto = new Producto();
    producto.setId("P001");
    producto.setNombre("Laptop");
    producto.setCategoria("Tecnologia");
    producto.setPrecio(800);
    producto.setStock(10);

    // MODELO PEDIDO
    Pedido pedido = new Pedido();
    pedido.setId("PED001");
    pedido.setProducto("Laptop");
    pedido.setPrecio(800);
    pedido.setCantidad(1);
    pedido.setEstado("Pendiente");

    // MODELO PAGO
    Pago pago = new Pago();
    pago.setId("PA001");
    pago.setPedidoId("PED001");
    pago.setMonto(800);
    pago.setMetodoPago("Tarjeta");
    pago.setEstado("Pagado");

    // MODELO ENVIO
    Envio envio = new Envio();
    envio.setId("E001");
    envio.setPedidoId("PED001");
    envio.setDireccion("Av. Principal");
    envio.setCiudad("Quito");
    envio.setEstado("En camino");

    // MOSTRAR RESULTADOS
    System.out.println("Cliente: " + cliente.getNombre());
    System.out.println("Producto: " + producto.getNombre());
    System.out.println("Pedido: " + pedido.getId());
    System.out.println("Pago: " + pago.getEstado());
    System.out.println("Envio: " + envio.getEstado());

    return 0;
}
    }

