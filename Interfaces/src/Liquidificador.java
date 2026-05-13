
import javax.swing.JOptionPane;



/**
 * Classe para gerar o objeto Liquidificador com as funcionalidades
 * bater (velocidades 1, 2 ou 3)
 * @author Luciene Celestino
 * @since Classe criada em 13/05/2026 - 11:51:23
 */
public class Liquidificador implements Eletrodomestico{

    @Override
    public void ligar() {
        System.out.println("Liquidificador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Liguidificador desligado");
    }
    public void Velocidade() throws InterruptedException{
        int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Qual velocidade deseja? "));
        
        switch (velocidade){
            case 0:
                desligar(); 
            case 1:
                ligar();
                System.out.println("Velocidade: " + velocidade);
                break;
            case 2:
                ligar();
                System.out.println("Velocidade: " + velocidade);
                 break;
            case 3:
                ligar();
                System.out.println("Velocidade: " + velocidade);
                 break;
            case 4:
                pulsar();
                System.out.println("Pulsando ");
                 break;
                 
            default:
            
    }
    }
    public void pulsar() throws InterruptedException{
        Thread.sleep(3);
    }
    
}

