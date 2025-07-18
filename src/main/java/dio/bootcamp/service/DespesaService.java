package dio.bootcamp.service;

import dio.bootcamp.domain.model.Despesa;

public interface DespesaService {

    Despesa findById(Long id) ;

    Despesa create(Despesa despesaToCreate);

    void delete(Long id);

}
