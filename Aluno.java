import java.util.Calendar;
public class Aluno extends Pessoa{
//    Atributos
    private String matricula;

//    Construtor
public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
    super(nome, data_nascimento, CPF, endereco);
}
//  métodos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String recuperarNome() {
        return nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }
    public int recuperarIdade() {
        return idade;
    }

}


