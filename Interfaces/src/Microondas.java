
import javax.swing.JOptionPane;


/**
 * Classe concreta para implementar TODOS os métodos ABSTRATOS da interface Eletrodomesticos
 * @author Luciene Celestino
 * @since Classe criada em 13/05/2026 - 10:55:23
 */
public class Microondas implements Eletrodomestico{

    @Override // SOBREESCRITA DO MÉTODO LIGAR DA INTERFACE
    public void ligar() {
        System.out.println("O Microondas foi ligado, a Luz está acesa");
    }

    //SOBRECARGA DO MÉTODO LIGAR DESSA CLASSE
    public void ligar(int tempo) throws InterruptedException {
        int i;
        ligar();
        for (i = tempo; i > 0; i--){
            System.out.println(i);
            Thread.sleep(200); //o processamento do programa ficara suspenso por mil milissegundos - 1segundo
        }
        desligar();
    }
    
    // Funcionalidade para o botao pipoca - tempo pré determinado
    public void pipoca() throws InterruptedException{
        System.out.println("Estourando pipoca!!");
        ligar(45); //chama o metodo ligar mas agora com o tempo definido
        System.out.println("Pipoca Pronta");
    }
        // Funcionalidade para o botao descongelar alimentos - tempo pré determinado
    public void descongelarAlimentod() throws InterruptedException{ 
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tempo de descongelamento? "));
        System.out.println("Descongelando Alimento!!");
        ligar(tempo); //chama o metodo ligar mas agora com o tempo definido
        System.out.println("Alimento descongelado!!!");
    }
    
        //Funcionalidade quando o usuario escolhe o tempo
    public void usuarioEscolheTempo() throws InterruptedException{
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tempo desejado? "));
        System.out.println("Esquentando Alimento - Bebida!!");
        ligar(tempo); //chama o metodo ligar mas agora com o tempo definido
        System.out.println("Alimento - Bebida quente!!!");
    }
    
    
    
    @Override
    public void desligar() {
        System.out.println("O Microondas foi desligado, Aviso sonório");
    }

}
