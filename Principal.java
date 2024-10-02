import java.util.Calendar;

public class Principal {
//    Atributos
    private static Aluno aluno1, aluno2, aluno3;
    private static Endereco endereco1, endereco2, endereco3;
    private static Empregado empregado, diretor;
    private static Calendar data1, data2, data3;
    private static Escola escola;

//    Método

    private static void criarEndereco() {
        endereco1 = new Endereco("Mendanha", 2854);
        endereco2 = new Endereco("Bancha", 98);
        endereco3 = new Endereco("Ana Neri", 22);
    }
    private static void criarData() {
        data1 = Calendar.getInstance(); // Inicializa o objeto Calendar
        data1.set(1998, 02, 19);
        data2 = Calendar.getInstance(); // Inicializa o objeto Calendar
        data2.set(1998, 02, 18);
        data3 = Calendar.getInstance(); // Inicializa o objeto Calendar
        data3.set(1997, 02, 18);
    }
    private static void criarAlunos() {
        aluno1 = new Aluno("Rafael", data1,15399977757L, endereco1);
        aluno2 = new Aluno("Daniele", data2,15567977757L, endereco2);
        aluno3 = new Aluno("Victor", data3,15234977757L, endereco3);
    }
    private static void matricularAlunos() {
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
    }

//    Método main
    public static void main(String[] args){
        escola = new Escola("Escola Control", "42.336.174/0006-13");

        criarEndereco();
        criarData();
        criarAlunos();
        matricularAlunos();
        escola.agruparAlunos();



//       aluno
//        int idade;
//        Calendar data = Calendar.getInstance();
//        data.set(1998,02,19);
//        endereco = new Endereco("Mendanha", 2854);
//
//        aluno = new Aluno("Rafael", data,15399977757L, endereco);
//        aluno.atualizarIdade();
//        idade = aluno.recuperarIdade();
//
//        System.out.println("Aluno: "+aluno.recuperarNome());
////diretor
//        data.set(1980, 10, 23);
//        empregado = new Empregado("Clara Silva", data , 211456937 , null);
//        empregado.gerarMatricula();
//        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
//        diretor.gerarMatricula();
//        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
//        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());

    }
}
