package dio.bootcamp.service.impl;

import dio.bootcamp.domain.model.Despesa;
import dio.bootcamp.domain.repository.DespesaRepository;
import dio.bootcamp.service.DespesaService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class DespesaServiceImpl implements DespesaService {

    private final DespesaRepository despesaRepository;

    public DespesaServiceImpl(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }


    @Override
    public Despesa findById(Long id) {
        return despesaRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Despesa create(Despesa despesaToCreate) {
        return despesaRepository.save(despesaToCreate);
    }

    @Override
    public void delete(Long id) {

        Despesa despesa = this.findById(id);
        despesaRepository.delete(despesa);

    }

}