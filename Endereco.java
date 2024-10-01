public class Endereco {
//    Atributos
    private String nome_rua;
    private int numero;


//  Construtor
    public Endereco(String nome_rua, int numero){
        this.nome_rua = nome_rua;
        this.numero = numero;
    }
//  Métodos
    public String recuperarNomeRua(){
        return nome_rua;
    }
    public int recuperarNumero(){
        return numero;
    }

    public void setNomeRua(String nome_rua){
        this.nome_rua = nome_rua;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public static void main(String args[]){
        Endereco e = new Endereco("Mendanha", 2854);
        System.out.println("Nome da Rua: "+e.recuperarNomeRua());
        System.out.println("Numero: "+e.recuperarNumero());
    }
}
