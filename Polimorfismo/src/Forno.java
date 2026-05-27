

/**
 * Classe para 
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 10:43:46
 */

// essa classe ela será polimorfica
public class Forno {
    //passando a interface Pizza, e o sabor da pizza(objeto)
    public void preparar(Pizza pizza){
        pizza.montarPizza();
        pizza.assarPizza();
        pizza.cobrarPizza();
    }
}
