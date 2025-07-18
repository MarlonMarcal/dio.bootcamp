package dio.bootcamp.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "tb_subconta")
public class SubConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subConta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SubConta2> subConta2;
}
