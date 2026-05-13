
import javax.swing.JOptionPane;

/**
 * Classe concreta para implementar TODOS os métodos ABSTRATOS da interface Eletrodomesticos
 * @author Luciene Celestino
 * @since Classe criada em 13/05/2026 - 10:50:43
 */
public class Televisao implements Eletrodomestico{

    @Override // sobrescrita
    public void ligar() {
        System.out.println("A TV foi ligada");
    }

    @Override // sobrescrita
    public void desligar() {
         System.out.println("A TV foi desligada");
    }
    
    //Método para simular a funcionalidade soneca
    public void soneca() throws InterruptedException{
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tempo de soneca? "));
        int i;
        ligar();
        for (i = tempo; i > 0; i--){
            // System.out.println(i);
            if(i == 30)
               
                System.out.println("Falta 30 Minutos");
                if(i == 15)
                    
                    System.out.println("Falta 15 Minutos");
                if(i == 5)
                    
                    System.out.println("Falta 5 Minutos");
                if(i == 1)
                    
                    System.out.println("Falta 1 Minutos");
            Thread.sleep(200); //o processamento do programa ficara suspenso por mil milissegundos - 1segundo
        }
        desligar();
    }
    
}
