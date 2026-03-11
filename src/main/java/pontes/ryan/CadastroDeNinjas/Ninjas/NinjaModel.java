package pontes.ryan.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pontes.ryan.CadastroDeNinjas.Missoes.MissoesModel;

import java.util.List;

//Entity ele transforma uma classe em uma entidade no DB
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne um ninja tem uma unica missão (primeiro é a propria classe, o segundo é o atributo)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key
    private List<MissoesModel> missoes;

}
