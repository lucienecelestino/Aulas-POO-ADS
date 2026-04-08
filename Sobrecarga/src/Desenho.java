
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
        
    }//fim do main
}//fim da classe
