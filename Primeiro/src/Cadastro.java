
/**
 * Classe para Instanciar Objetos do Tipo Pesso
 * @author Luciene Celestino
 * @date Classe Criada em 18/03/2026
 */
public class Cadastro {
    public static void main(String []args){//static não precisa de um
       
        //criando uma variavel que referencia um objeto
        Pessoa p;
        //crinado um objeto na memória
        p = new Pessoa("Luciene", 24, (float)1.68, 50, false);
        //é possivel criar a variavel de referencia e instanciar, ou seja criar o objeto
        //Pessoa: classe// x:variavel que referencia o objeto// e Pessoa  é o construtor
        Pessoa x = new Pessoa("Mariana", 23, 1.62f, 200, true);
        Pessoa pessoa = new Pessoa("Sebastião", 38, 1.75f, 100, true);
        
        //mostrando os dados de cada objeto
        p.exibirDadosPessoa();
        x.exibirDadosPessoa();
        pessoa.exibirDadosPessoa();
        
        Compara comparação = new Compara(p, x);
      
    }
}
