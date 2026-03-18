
/**
 * Classe modelo para gerar um objeto do tipo Pessoa
 * @author Luciene Celestino
 * @date 18/03/2026
 */
public class Pessoa {
    //Atributos da Classe
    String nome;
    int idade;
    float altura;
    float peso;
    boolean casado;
    
    //Método Construtor da Classe para gerar um objeto na memória e deve receber parametros
    public Pessoa(String nome, int idade, float altura, float peso, boolean casado){  
// para referenciar os atributo, se não vai achar que esta sendo apenas os parametros/ variaveis
       
       // atrubutos = parametros/variavel
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }
    
    
    //Método Comum para exibir os dados de uma pessoa
    public void exibirDadosPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Classificação IMC: " + classificarIMC(calcularIMC()));
        System.out.println("Casado: " + (casado == true? "Sim" : "Não"));
        
    }
   
    //Método Comum para calcular o IMC de uma Pessoa
         public float calcularIMC(){
             float imc;
             imc = peso/(altura*altura);
             return imc;
         }

    //método para classicar o IMC da Pessoa
         public String classificarIMC(float imc){
           if (imc <= 16)
            return("Magreza grau III");
           else if (imc <= 16.90)
            return("Magreza grau II");
           else if (imc <= 18.40)
            return("Magreza grau I");
           else if (imc <= 24.90)
            return("Eutrofia");
           else if (imc <= 29.90)
            return("Pré-obesidade");
           else if (imc <= 34.90)
            return("Obsidade moderada (grau I)");
           else if (imc <= 39.90)
            return("Obsidade moderada (grau II)");
           else
               return("Obsidade muito severa (grau III)");
             

         }
         
         
         // objeto que fara a 
         
}
