

/**
 * Classe para ASSOCIAR dois Objetoos (Veiculo e Propreitário)
 * @author Luciene Celestino
 * @since Classe criada em 01/04/2026 - 11:24:05
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class Venda {
    int codVenda;
    LocalDate data;
    DateTimeFormatter formatadorData =  DateTimeFormatter.ofPattern("dd/MM/yyyy");// objeto formatador
    DecimalFormat decodificador = new DecimalFormat("###,###,00");
    Veiculo veiculo;
    Proprietario proprietario;
    
    //construtor da classe venda

    public Venda(int codVenda, String data, Veiculo veiculo, Proprietario proprietario) {
        this.codVenda = codVenda;
        this.data = LocalDate.parse(data,formatadorData);
        this.veiculo = veiculo;
        this.proprietario = proprietario;
    }

    //Método comum para exibir a venda realizada
    public void exibirVenda(){
        String msg;
        msg = proprietario.nome + " Adiquiriu o Veiculo : " + 
                veiculo.modelo + " pelo preço de: " +
                decodificador.format(veiculo.valor) + " cuja venda tem o número: "+
                codVenda + "na data: " + formatadorData.format(data);
        System.out.println(msg);
    }
}

