package pontes.ryan.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import pontes.ryan.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String missao;

    private String dificuldade;

    // @OneToMany Uma missão para muitos ninjas (primeiro é a propria classe, o segundo é o atributo)
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;
}
