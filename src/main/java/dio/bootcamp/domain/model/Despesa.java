package dio.bootcamp.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity(name = "tb_despesa")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat
    private Date dtEmissao;
    @DateTimeFormat
    private Date dtVencimento;

    @Column(precision = 13,  scale = 2)
    private BigDecimal valor;
    private String numeroDoc;

    @Column(precision = 13,  scale = 2)
    private BigDecimal valorPago;

    @DateTimeFormat
    private Date dtPagamento;

    @ManyToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @ManyToOne(cascade = CascadeType.ALL)
    private Fornecedor fornecedor;


}
