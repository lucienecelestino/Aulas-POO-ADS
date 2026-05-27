

/**
 * Classe para implementar os métodos da interface Pizza
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 11:48:29
 */
public class PaoCaseiro implements Pizza{

    @Override
    public void montarPizza() {
        System.out.println("Pão Caseiro");
        System.out.println("Farinha de Trigo, ovos, leite, sal, açucar e fermento");
    }

    @Override
    public void assarPizza() {
        System.out.println("Tempo de forno: 45 minutos");
    }

    @Override
    public void cobrarPizza() {
        System.out.println("Preço: 10,00");
    }

}
