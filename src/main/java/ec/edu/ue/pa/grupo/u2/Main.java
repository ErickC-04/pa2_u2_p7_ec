
package ec.edu.ue.pa.grupo.u2;

import ec.edu.ue.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.ue.pa.grupo.u2.pedidos.application.ClienteService;
import ec.edu.ue.pa.grupo.u2.pedidos.application.CategoriaService;
import ec.edu.ue.pa.grupo.u2.pedidos.application.ProductoService;
import ec.edu.ue.pa.grupo.u2.pedidos.application.PagoService;
import ec.edu.ue.pa.grupo.u2.pedidos.application.EnvioService;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Categoria;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Producto;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pago;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Envio;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Inject
    private ClienteService clienteService;

    @Inject
    private CategoriaService categoriaService;

    @Inject
    private ProductoService productoService;

    @Inject
    private PagoService pagoService;

    @Inject
    private EnvioService envioService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        // GUARDAR PEDIDO
        Pedido pedido = new Pedido();
        pedido.setProducto("Laptop");
        pedido.setPrecio(850.00);
        this.pedidoService.guardar(pedido);

        System.out.println("Pedido guardado correctamente");

        // GUARDAR CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setCorreo("juan@gmail.com");
        cliente.setTelefono("0991234567");
        this.clienteService.guardar(cliente);

        System.out.println("Cliente guardado correctamente");

        // GUARDAR CATEGORIA
        Categoria categoria = new Categoria();
        categoria.setNombre("Tecnologia");
        categoria.setDescripcion("Productos electronicos");
        categoria.setEstado("Activo");
        categoria.setTipo("Electronica");
        this.categoriaService.guardar(categoria);

        System.out.println("Categoria guardada correctamente");

        // GUARDAR PRODUCTO
        Producto producto = new Producto();
        producto.setNombre("Laptop HP");
        producto.setCategoria("Tecnologia");
        producto.setPrecio(850.00);
        producto.setStock(10);
        this.productoService.guardar(producto);

        System.out.println("Producto guardado correctamente");

        // GUARDAR PAGO
        Pago pago = new Pago();
        pago.setPedidoId(pedido.getId());
        pago.setMonto(850.00);
        pago.setMetodoPago("Tarjeta");
        pago.setEstado("Pagado");
        this.pagoService.guardar(pago);

        System.out.println("Pago guardado correctamente");

        // GUARDAR ENVIO
        Envio envio = new Envio();
        envio.setPedidoId(pedido.getId());
        envio.setDireccion("Av. Amazonas");
        envio.setCiudad("Quito");
        envio.setEstado("Pendiente");
        this.envioService.guardar(envio);

        System.out.println("Envio guardado correctamente");

        System.out.println("Hello, Quarkus!");

        return 0;
    }
}
