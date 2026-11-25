package ec.edu.ue.pa.grupo.u2.pedidos.application;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Categoria;
import ec.edu.ue.pa.grupo.u2.pedidos.domain.repository.CategoriaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CategoriaService {

    @Inject
    private CategoriaRepository categoriaRepository;

    public void guardar(Categoria categoria) {
        this.categoriaRepository.create(categoria);
    }

    public Categoria buscarPorId(Integer id) {
        return this.categoriaRepository.read(id);
    }

    public void actualizar(Categoria categoria) {
        this.categoriaRepository.update(categoria);
    }

    public void eliminar(Integer id) {
        this.categoriaRepository.delete(id);
    }

}