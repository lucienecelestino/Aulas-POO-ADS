
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Classe para exemplificar a criação de Threads em um processo
 * @author Luciene Celestino
 * @since Classe criada em 10/06/2026 - 11:46:50
 */
public class Processo extends Thread{
    int sleepTime;//quanto tempo essa thread vai dormir
    
    public Processo(String nome){
        super(nome);
            sleepTime = (int)(Math.random() * 5000);
            System.out.println("A Thread " + nome + " dormirá por " + sleepTime + " ms.");
    }
    
    @Override
    public void run(){
        try {
            System.out.println("A Thread " + getName() + " foi dormir... ");
            Thread.sleep(sleepTime);
            
        } catch (InterruptedException ex) {
            System.out.println("A Thread foi interrompida!!!");
        }
        System.err.println("A Thread " + getName() + " ACORDOU =====");
    }
}
