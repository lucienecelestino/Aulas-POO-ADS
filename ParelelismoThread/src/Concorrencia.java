

/**
 * Classe para dar start nas threads
 * @author Luciene Celestino
 * @since Classe criada em 10/06/2026 - 11:59:51
 */
public class Concorrencia {
    public static void main(String[] args) {
        //criando a THREAD
        while(true){
        Processo t1, t2, t3, t4;
        t1 = new Processo("Luciene");
        t2 = new Processo("Fatec Santana de Parnaiba");
        t3 = new Processo("Amanhã começa a copa do mundo");
        t4 = new Processo("Semana que vem tem circo");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        }
        
    }

}
