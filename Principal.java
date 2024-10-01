import java.util.Calendar;

public class Principal {
//    Atributos
    private static Aluno aluno;
    private static Endereco endereco;

//    Método main
    public static void main(String[] args){
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1998,02,19);
        endereco = new Endereco("Mendanha", 2854);

        aluno = new Aluno("Rafael", data,15399977757L, endereco);
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();

        System.out.println("Aluno: "+aluno.recuperarNome());
    }
}
