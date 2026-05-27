

/**
 * Classe para...
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 11:05:31
 */
public class FrangoCatupiry implements Pizza{
   @Override
    public void montarPizza() {
        System.out.println("Pizza Franco com Catupy");
        System.out.println("Frango, Catupiry, Oregano");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 10 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 56,00");
    }
}
