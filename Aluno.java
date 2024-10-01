import java.util.Random;

public class Aluno {
//    Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

//    Construtor
public Aluno(String nome, int idade) {
    aleatorio = new Random();
    this.nome = nome;
    this.idade = idade;
    this.codigo_identificador = aleatorio.nextDouble();
}

//  métodos
    private void setNome(String nome) {
        this.nome = nome;
    }
    public String recuperarNome() {
        return nome;
    }

    private void setidade(int idade) {
        this.idade = idade;
    }
    public int recuperarIdade() {
        return idade;
    }


    public static void main(String args[]){
        Aluno a = new Aluno("Rafael", 26);

        System.out.println("Nome: "+a.recuperarNome());
        System.out.println("Idade: "+a.recuperarIdade());
    }
}