package ec.edu.ue.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.ue.pa.grupo.u2.pedidos.domain.model.Envio;

public interface EnvioRepository {

    public void create(Envio envio);

    public Envio read(Integer id);

    public void update(Envio envio);

    public void delete(Integer id);

}