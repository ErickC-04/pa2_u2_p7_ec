package ec.edu.ue.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class PedidoRepositoryImpl implements PedidoRepository {

    // Entityt manager es la interfaz q me permite interactuar desde mi repository
    // con mi base de datos
    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {
        this.entityManager.persist(pedido); // hace el insert
    }

    @Override
    public Optional<Pedido> read(Integer id) {
        Pedido pedido = this.entityManager.find(Pedido.class, id);
        return Optional.ofNullable(pedido);
    }

    @Override
    public void update(Pedido pedido) {
        // TODO Auto-generated method stub
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Optional<Pedido> pedido = this.read(id);
        pedido.ifPresent(this.entityManager::remove);
    }

    @Override
    public List<Pedido> readAll() {
        TypedQuery<Pedido> query2 = this.entityManager.createQuery(
                "SELECT p FROM Pedido p",
                Pedido.class);

        return query2.getResultList();
    }

    @Override
    public Optional<Pedido> readByNumber(String numero) {
        TypedQuery<Pedido> query = this.entityManager.createQuery(
                "SELECT p FROM Pedido p WHERE p.numero = :numeroVariable",
                Pedido.class);
        query.setParameter("numeroVariable", numero);
        return query.getResultStream().findFirst();
    }

    @Override
    public List<Pedido> readAllNative() {
        Query myQuery = this.entityManager.createNativeQuery(
                "SELECT * FROM pedidos",
                Pedido.class);
        return myQuery.getResultList();
    }

    @Override
    public Optional<Pedido> readByNumberNative(String numero) {
        // TODO Auto-generated method stub
        Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM pedidos p WHERE p.pedd_numero = :numero",
                Pedido.class);
        myQuery.setParameter("numero", numero);
        Pedido pedido = (Pedido) myQuery.getSingleResult();
        return Optional.ofNullable(pedido);
    }

}