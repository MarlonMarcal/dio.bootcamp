package dio.bootcamp.controller;

import dio.bootcamp.domain.model.Despesa;
import dio.bootcamp.service.DespesaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Despesa> findById(@PathVariable Long id) {
        var despesa = despesaService.findById(id);
        return ResponseEntity.ok(despesa);
    }

    @PostMapping
    public ResponseEntity<Despesa> create(@RequestBody Despesa despesaToCreate) {
        var despesaCreate = despesaService.create(despesaToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(despesaCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(despesaCreate);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        despesaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
