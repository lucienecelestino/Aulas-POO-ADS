
import javax.swing.JOptionPane;


/**
 * Classe para instanciar objetos do tipo Figura (Ponto, Linha, Triângulo)
 * @author Luciene Celestino
 * @since Classe criada em 08/04/2026 - 10:03:53
 */
public class Desenho {
    public static void main(String[] args) {

        /*
          //objetod que precisam passar parametros  
        Figura ponto = new Figura(500);
        
        Figura linha = new Figura(10, 60);
        
        Figura triangulo = new Figura(10, 10, 10);
        
        Figura retangulo = new Figura(25, 50, 25, 50);
        
        //tendo que passar parametro po parametro
        ponto.exibirFigura(0);
        linha.exibirFigura(true);
        triangulo.exibirFigura("");
        retangulo.exibirFigura(0.00f);
        
        //sem precisar passar parametro  
        ponto.exibirFigura();
        linha.exibirFigura();
        triangulo.exibirFigura();
        retangulo.exibirFigura();
        */
        
        
        //Figura Genérica, com entrada de dados direto do usuário
       while(true){
       Figura figuragenerica = new Figura();
        figuragenerica.exibirFigura();
    }
         
        
        //configurando uma caixa de dialogo para mensgame
        /* JOptionPane.showMessageDialog(1,2,3,4);
        1 - this/null
        2 - Texto que aparece dentro da janela
        3 - Titulo da janela
        4 - icone - pode variar de -1 a 3
        //variação
        -1 - sem icone
        0 - Error - Icone de erro
        1 - Information - Informação para o usuário;
        2 - Warning - Aviso para o usuário
        3 -  Question - Interrogação - Usuário entra com dado
        */
        
        //testando os icones
       //JOptionPane.showMessageDialog(null,"Mensagem ao usuario", "luciene", -1); 
        
    }//fim do main
}//fim da classe
