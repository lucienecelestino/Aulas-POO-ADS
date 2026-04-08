

/**
 * Classe filha que herda TODOS os atributos e métodos da super classe veiculo
 * @author Luciene Celestino
 * @since Classe criada em 01/04/2026 - 10:03:55
 */

//extends, estende a classe pai, ou seja ela aumenta as funcionalidades da classe pai
public class Carro extends Veiculo{
    String cor;
    boolean arCondicionado;
    int volPortaMalas;
    float potencia;

    //constructor de carro em memória
    public Carro(String marca, String modelo, int ano, float valor, String cor, boolean arCondicionado, int volPortaMalas, float potencia) {
        super(marca, modelo, ano, valor); // você enviar os dados que coletou na classe carro, para a classe Veiculo
        this.cor = cor;
        this.arCondicionado = arCondicionado;
        this.volPortaMalas = volPortaMalas;
        this.potencia = potencia;
    }
    
    // Método comum para exibir os dados do Carro
    public void exibirDadosCarro(){
        super.exibirDadosVeiculo(); // como super vc acesssa o que tem na classe mãe
        System.out.println("Cor: " + cor);
        System.out.println("possui ar Condicionado: " + (arCondicionado?"Sim":"Não"));
        System.out.println("Volume do porta malas: " + volPortaMalas + "Litros");
        System.out.println("Potencia do motor: " + potencia);
    }
    //
    
    
}
