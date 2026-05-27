
/**
 * Classe para implementar todos os métodos da interface Pizza
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:32:50
 */
public class Marguerita implements Pizza{

      @Override
    public void montarPizza() {
        System.out.println("Pizza Margerita");
        System.out.println("Mussarela, Molho de Tomate, tomate seco, manjericão e azeitonas pretas");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 12 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 50,00");
    }

}
