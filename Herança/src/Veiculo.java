
/**
 * Classe para demonstrar o conceito de Herança dentro da linguagem Java
 * @author Luciene Celestino
 * @since Classe criada em 01/04/2026 - 09:46:31
 */

//Sessão de importação
import java.text.DecimalFormat;
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    float valor;

    //contrutor do objeto veiculo em memoria
    public Veiculo(String marca, String modelo, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    
    //metodo para exibir os dados do veiculo
    public void exibirDadosVeiculo(){
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("Valor em R$: " + formatador.format(valor));//formata o valor de acordo com o critério que vc passou
                
    }
    
}


