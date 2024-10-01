import java.util.Calendar;


public class Pessoa {
    protected String nome;
    protected int idade;
    protected Calendar data_nascimento;
    protected long CPF;
    protected Endereco endereco;

// Construtor
    public Pessoa(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }

//    Método
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected  String recuperarNome(){
        return nome;
    }
    protected void atualizarIdade(){
        this.idade = calcularIdade();
    }
    protected int recuperarIdade(){
        return idade;
    }

    protected void atualizarCPF(long CPF){
        this.CPF = CPF;
    }
    protected long recuperarCPF(){
        return CPF;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco(){
        return endereco;
    }
    private int calcularIdade(){
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int anoNascimento = data_nascimento.get(Calendar.YEAR);
        int idadeCalculada = anoAtual - anoNascimento;

        // Verifica se já passou o aniversário este ano
        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        int mesNascimento = data_nascimento.get(Calendar.MONTH);
        int diaNascimento = data_nascimento.get(Calendar.DAY_OF_MONTH);

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idadeCalculada--;
        }

        return idadeCalculada;
    }
}
