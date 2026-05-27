

/**
 * Classe para implementar todo os métodos da interface Pizza
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:36:21
 */
public class Portuguesa implements Pizza{
      @Override
    public void montarPizza() {
        System.out.println("Pizza Portuguesa");
        System.out.println("Molho de Tomate, queijo, presunto, ervilha, ovo cozido, milho, cebola e azeitona");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 13 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 56,00");
    }
}
