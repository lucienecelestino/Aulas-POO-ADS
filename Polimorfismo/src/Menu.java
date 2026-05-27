
import javax.swing.JOptionPane;


/**
 * Classe para exibir um Menu de opções para o cliente
 * @author Luciene Celestino
 * @since Classe criada em 27/05/2026 - 11:09:00
 */
public class Menu {
    Forno forno = new Forno();
    Pizza pizza;
    public Menu(){
        String msg;
        msg = "              1 - QuatroQueijos\n" +
"              2 - Marguerita\n" +
"              3 - Portuguesa\n" +
"              4 - Pistache\n" +
"              5 - Toscana\n" +
"              6 - Hamburguer\n" +
"              7 - Frambacon\n" +
"              8 - FrangoCatupiry\n"+
"              9 - Sair";
        int opcao = 0;
    while(true){
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Escolha sua PIZZA", 3));
  
        switch(opcao){
            case 1: pizza = new QuatroQueijos();
                break;
            case 2: pizza = new Marguerita();
                break;
            case 3: pizza = new Portuguesa();
                break;
            case 4: pizza = new Pistache();
                break;
            case 5: pizza = new Toscana();
                break;
            case 6: pizza = new Hamburguer();
                break;
            case 7: pizza = new Frambacon();
                break;
            case 8: pizza = new FrangoCatupiry();
                break;
            case 9: System.exit(0);
            
            default: JOptionPane.showConfirmDialog(null, "Seleção inexistente !!");
            opcao = 0;
        }//fim do swtch
        if(opcao != 0){
            forno.preparar(pizza);
        }
        
         // Objeto polimorfico que prepara qualquer tipo de pizza
        forno.preparar(pizza);
    }//fim do while
        
    }// fim do construtor
}
