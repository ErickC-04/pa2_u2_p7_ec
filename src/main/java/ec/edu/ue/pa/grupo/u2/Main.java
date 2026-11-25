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

    @Override
    public int run(String... args) throws Exception {

        // Guardar pedido
        Pedido pedido = new Pedido();
        pedido.setProducto("Laptop");
        pedido.setPrecio(850.0);
        this.pedidoService.guardar(pedido);

        // Guardar cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setCorreo("juan@gmail.com");
        cliente.setTelefono("0991234567");
        this.clienteService.guardar(cliente);

        // Guardar categoria
        Categoria categoria = new Categoria();
        categoria.setNombre("Tecnologia");
        categoria.setDescripcion("Productos tecnologicos");
        categoria.setEstado("Activo");
        categoria.setTipo("Electronica");
        this.categoriaService.guardar(categoria);

        // Guardar producto
        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setCategoria("Tecnologia");
        producto.setPrecio(850.0);
        producto.setStock(10);
        this.productoService.guardar(producto);

        // Guardar pago
        Pago pago = new Pago();
        pago.setPedidoId(pedido.getId());
        pago.setMonto(850.0);
        pago.setMetodoPago("Efectivo");
        pago.setEstado("Pagado");
        this.pagoService.guardar(pago);

        // Guardar envio
        Envio envio = new Envio();
        envio.setPedidoId(pedido.getId());
        envio.setDireccion("Av. Amazonas");
        envio.setCiudad("Quito");
        envio.setEstado("Pendiente");
        this.envioService.guardar(envio);

        System.out.println("Todos los registros guardados correctamente");

        return 0;
    }
}