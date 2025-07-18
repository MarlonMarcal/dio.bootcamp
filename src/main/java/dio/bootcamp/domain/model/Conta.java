package dio.bootcamp.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "tb_conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SubConta> subConta;
}
