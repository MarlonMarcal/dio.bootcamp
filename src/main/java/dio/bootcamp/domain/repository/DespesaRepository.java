package dio.bootcamp.domain.repository;

import dio.bootcamp.domain.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
