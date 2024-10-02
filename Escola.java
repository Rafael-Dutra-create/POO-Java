import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Escola {
    //    Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Aluno> discentes;
    private int nr_discentes, nr_departamentos;

    //Construtor
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<>();
        this.discentes = new ArrayList<>();
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }

    //    métodos
    public void criarDepartamento(String nomeDepartamento) {
        if (nr_departamentos <= 10) {
            departamentos.add(new Departamento(nomeDepartamento));
            nr_departamentos++;
        } else {
            System.out.println("Não é possivel criar outro Departamento.");
        }
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno novoAluno) {
        if (nr_discentes < 1000) {
            discentes.add(novoAluno);
            nr_discentes++;
        } else {
            System.out.println("Não é possível matricular mais alunos.");
        }
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void agruparAlunos() {
//        Map<String, List<String>> agrupamento = new HashMap<>();
//        for (Aluno a : discentes) {
//            String idade = String.valueOf(a.recuperarIdade());
//            agrupamento.putIfAbsent(idade, new ArrayList<>());
//            agrupamento.get(idade).add(a.recuperarNome());
//        }
//        System.out.println("Resultado do agrupamento por idade: " + agrupamento);
//    }
//        Resultado do agrupamento por idade: {26=[Rafael, Daniele], 27=[Victor]} ---ok
        Map<String, Set<String>> agrupamento =
                discentes.stream().collect(Collectors.groupingBy(
                        aluno -> String.valueOf(aluno.recuperarIdade()),
                        Collectors.mapping(Aluno::recuperarNome, Collectors.toSet())
                ));

        System.out.println("Resultado do agrupamento por idade: ");
        agrupamento.forEach((chave, conjunto) -> System.out.println(chave + ": " + conjunto));
//    Resultado do agrupamento por idade:
//            26: [Rafael, Daniele]
//            27: [Victor]
    }


}