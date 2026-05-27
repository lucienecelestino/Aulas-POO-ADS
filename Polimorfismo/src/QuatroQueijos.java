
/**
 * Classe para implementar todo os métodos da interface Pizza
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:26:59
 */
public class QuatroQueijos implements Pizza{

    @Override
    public void montarPizza() {
        System.out.println("Pizza Quatro Queijos");
        System.out.println("Mussarela, Catupiry, Provolone, Parmesão e Azeitona");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de Forno: 15 minutos");
        
    }

    @Override
    public void cobrarPizza() {
       System.out.println("Valor: R$ 60,00");
    }

}