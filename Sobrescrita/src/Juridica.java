
/**
 * Classe que vai herdar os metodos e atributos da classe pessoa
 * @author Luciene Celestino
 * @since Classe criada em 22/04/2026 - 10:45:38
 */

//Sessão de importação
import java.text.DecimalFormat;
public class Juridica extends Pessoa{
    int cnpj;
    String nomeFantasia;
    String porte;
    float faturamento;

    public Juridica(String nome, int idade, int cnpj, String nomeFantasia, float faturamento) {
        
        super(nome, idade);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.faturamento = faturamento;
        this.porte = estimarPorte();
        
    }
    
    public String estimarPorte(){
        if(faturamento <= 81000){
        return "MEI";
    }else if(faturamento <= 3600000){
        return "ME";
            }else if(faturamento <= 4800000)
                return "EPP";
        else
                return "Empresas de Médio e Grande Porte";
    }
    
    @Override
    public void exibirDados(){
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Faturamento: " + formatador.format(faturamento));
        System.out.println("Porte: " + porte);
    }
    //SOBRECARGA
      public void exibirDados(int b){
        System.out.println("\nCNPJ: " + cnpj);
        System.out.println("Nome Fantasia: " + nomeFantasia);
      
        
    }
}
