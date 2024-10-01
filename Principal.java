import java.util.Calendar;

public class Principal {
//    Atributos
    private static Aluno aluno;
    private static Endereco endereco;
    private static Empregado empregado, diretor;
//    Método main
    public static void main(String[] args){
//        aluno
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1998,02,19);
        endereco = new Endereco("Mendanha", 2854);

        aluno = new Aluno("Rafael", data,15399977757L, endereco);
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();

        System.out.println("Aluno: "+aluno.recuperarNome());
//diretor
        data.set(1980, 10, 23);
        empregado = new Empregado("Clara Silva", data , 211456937 , null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
        diretor.gerarMatricula();
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());

    }
}
