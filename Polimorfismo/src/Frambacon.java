

/**
 * Classe para...
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 11:00:45
 */
public class Frambacon implements Pizza{
   @Override
    public void montarPizza() {
        System.out.println("Pizza Frambacon");
        System.out.println("Frango, CreamChese, Bacon");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 15 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 70,00");
    }
}
