

/**
 * Classe para...
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:56:38
 */
public class Toscana implements Pizza{
       @Override
    public void montarPizza() {
        System.out.println("Pizza Toscana");
        System.out.println("Molho de Tomate, queijo, calabresa, cebola");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 6 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 55,00");
    }
}
