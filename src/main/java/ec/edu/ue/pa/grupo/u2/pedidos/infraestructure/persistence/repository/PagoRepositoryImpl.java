
package ec.edu.ue.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Pago;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class PagoRepositoryImpl implements PagoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pago pago) {
        entityManager.persist(pago);
    }

    @Override
    public Pago read(Integer id) {
        return entityManager.find(Pago.class, id);
    }

    @Override
    public void update(Pago pago) {
        entityManager.merge(pago);
    }

    @Override
    public void delete(Integer id) {
        Pago pago = entityManager.find(Pago.class, id);

        if (pago != null) {
            entityManager.remove(pago);
        }
    }
}
