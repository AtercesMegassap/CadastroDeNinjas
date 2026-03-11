package pontes.ryan.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import pontes.ryan.CadastroDeNinjas.Missoes.MissoesModel;

import java.util.List;

//Entity ele transforma uma classe em uma entidade no DB
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
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

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
