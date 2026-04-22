

/**
 * Classe para criar um objeto do tipo pessoa
 * @author Luciene Celestino
 * @since Classe criada em 22/04/2026 - 10:08:18
 */
public class Pessoa {
    String nome;
    int idade;
    

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
       
    }
    
    //Método Comum para exibir os dados
    public void exibirDados(){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        
    }
}
