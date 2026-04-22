

/**
 * Classe que herda todos os atributos de pessoa
 * @author Luciene Celestino
 * @since Classe criada em 22/04/2026 - 10:21:59
 */
public class Fisica extends Pessoa{
    int cpf;
    String tipoSanguineo;
    String nomeMae;
    float altura;

    //Método construtor da classe
    public Fisica( String nome, int idade, int cpf, String tipoSanguineo, String nomeMae, float altura) {
        super(nome, idade);
        this.cpf = cpf;
        this.tipoSanguineo = tipoSanguineo;
        this.nomeMae = nomeMae;
        this.altura = altura;
    }
    
    //Método SOBRESCRITO da superclasse Pessoa de exibirDados
    @Override //significa sobrescrita
    public void exibirDados(){
        System.out.println("\n" + super.nome + " tem tipo Sanguineo " + tipoSanguineo);
        System.out.println(super.nome + " tem idade " + super.idade + " anos");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Altura: " + altura);
        
    }
    
    //Método SOBRECARREGADO
        public void exibirDados(String a){
        System.out.println("CPF " + cpf);
        System.out.println("Nome da Mãe " + nomeMae); 
    }
    
    
}
