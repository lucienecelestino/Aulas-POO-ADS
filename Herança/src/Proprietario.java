
import javax.swing.JOptionPane;


/**
 * Classe para gerar o objeto Proprietário que adquirirá o veiculo
 * @author Luciene Celestino
 * @since Classe criada em 01/04/2026 - 11:08:10
 */
public class Proprietario {
    String nome;
    String cpf;
    String telefone;
    
    //constructor do objeto Proprietário em memória

    //recebendo dados de uma caixa de dialogo
    public Proprietario() {
        this.nome = JOptionPane.showInputDialog("Nome:");
        this.cpf = JOptionPane.showInputDialog("CPF:");
        this.telefone = JOptionPane.showInputDialog("Telefone:");
    }
    //Método comum para gerar um objeto do tipo Proprietário
    public void exibirDadosProprietário(){
        System.out.println("Proprietário: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Contato: " + telefone);
    }
}
