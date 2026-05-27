

/**
 * Classe para implementar todo os métodos da interface Pizza
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:39:23
 */
public class Pistache implements Pizza{
      @Override
    public void montarPizza() {
        System.out.println("Pizza de Pistache");
        System.out.println("Pistache, Sorvete de Pistache, calda de chocolate branco");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 11 miutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 80,00");
    }
}
