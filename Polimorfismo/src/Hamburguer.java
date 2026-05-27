
/**
 * Classe para...
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:58:22
 */
public class Hamburguer implements Pizza{
       @Override
    public void montarPizza() {
        System.out.println("Pizza Hamburguer");
        System.out.println("Molho de Tomate, hamburguer, queijo");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 10 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 50,00");
    }
}
