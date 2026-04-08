
/**
 * Classe para...
 * @author Luciene Celestino
 * @since Classe criada em 01/04/2026 - 10:38:44
 */
public class Caminhao extends Veiculo{

    int numEixos;
    String tipoCarroceria;
    boolean rastreador;
    float tara;


//construtor
public Caminhao (String marca, String modelo, int ano, float valor,int numEixos, String tipoCarroceria,boolean rastreador,float tara){
    super(marca, modelo, ano, valor);
    this.numEixos = numEixos;
    this.tipoCarroceria = tipoCarroceria;
    this.rastreador = rastreador;
    this.tara = tara;

}

//Método de exibição de caminhão
public void exibirDadosCaminhao(){
    super.exibirDadosVeiculo();
    System.out.println("Quantidade de Eixos: " + numEixos);
    System.out.println("Tipo de Carroceria: " + tipoCarroceria);
    System.out.println("Rastreador: " + rastreador);
    System.out.println("tara: " + tara);
    
}

}

