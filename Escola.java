public class Escola {
//    Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private Departamento departamentos [];
    private Aluno discentes [];
    private int nr_discentes, nr_departamentos;

//Construtor
    public Escola (String nome, String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }
    //    métodos
    public void criarDepartamento(String nomeDepartamento){
        if(nr_departamentos <= 10){
            departamentos[nr_departamentos] = new Departamento(nomeDepartamento);
            nr_departamentos++;
        }else{
            System.out.println("Não é possivel criar outro Departamento.");
        }
    }
    public void matricularAluno(Aluno novoAluno) {
        if (nr_discentes < 1000) {
            discentes[nr_discentes] = novoAluno;
            nr_discentes++;
        } else {
            System.out.println("Não é possível matricular mais alunos.");
        }
    }

    public static void main(String args[]){
//        Crir uma nova escola
        Escola escola = new Escola("Estacio","12.345.678/0001-99");

//        Criar novos alunos
        Aluno aluno1 = new Aluno("Rafael", 26);
        Aluno aluno2 = new Aluno("Daniele", 22);

//        Matricula os alunos na escola
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);

//        Exemplo de como acessar dados dos alunos matriculados
        for (int i = 0; i < escola.nr_discentes; i++) {
            System.out.println("Nome: " + escola.discentes[i].recuperarNome());
            System.out.println("Idade: " + escola.discentes[i].recuperarIdade());
        }
    }
}
