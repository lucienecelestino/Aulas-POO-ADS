
import javax.swing.JOptionPane;

/**
 * Classe para instanciar objetos d otipo Ponto Linha, Triângulo e Retângulo
 * @author Luciene Celestino
 * @since Classe criada em 08/04/2026 - 09:45:59
 */
public class Figura {
    Integer a,b,c,d; // integer é uma classe - gera objetos do tipo integer
    
    
    //Construtor Genérioco para qualquer tipo de Figura
    public Figura(){
        String msg;
        msg = "1 - Ponto \n2 - Linha\n3 - Triângulo\n4 - Retângulo\n5 - Sair...";
        
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opcao){
            case 1: a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do ponto"));
                break;
            case 2: a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor da linha"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor da linha"));
                break;
            case 3: a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor do lado do Triângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor do lado do Triângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor do lado do Triângulo"));
                break;
            case 4: a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor do lado do Retângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor do lado do Retângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor do lado do Retângulo"));
                    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor do lado do Retângulo"));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Programa finalizado com Sucesso!!");
                System.exit(0);
        }
    }
    
    //Contrutor para um ponto
    public Figura(int a)
    {
        this.a = a;
    }
    
       //Contrutor para uma linha
    public Figura(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public Figura (int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
     public Figura (int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
     
     //Método Genérico para identificar qualquer tipo de figura
     public void exibirFigura(){
         if(a != null && b == null && c == null && d == null)
             exibirFigura(0);
         else if (a != null && b != null && c == null && d == null)
             exibirFigura(true);
         else if (a != null && b != null && c != null && d == null)
             exibirFigura("teste");
         else
             exibirFigura(0.0f);
     }
     
    /**
     * Método para exibir o valor de uma figura do tipo Ponto
     * @param w valor do tipo inteiro
     * @author Programador Luciene
     * @since Método criado em 07/04/2026
     */
    
    //exibir o valor do objeto ponto
    public void exibirFigura(int w){
        System.out.println("é um ponto de valor " + a);
    }
    
    /**
     * Método para exixbir as coordenadas de um parametro linha
     * @param x dado do tipo boolean
     * @author Maria
     * @since Método criado em 08/04/2026
     */
     //exibir as coordenada do objeto linha
    public void exibirFigura(boolean x){
        JOptionPane.showMessageDialog(null,"É uma linha de coordenadas "+ a + " e " + b);
    }
    
    //metodos para exibir dados do triangulo
    public void exibirFigura(String e){
        JOptionPane.showMessageDialog(null,"É um triângulo com valor " + a + " " + b + " " + c);
    }
     //metodos para exibir dados do retangulo
      public void exibirFigura(float f){
        JOptionPane.showMessageDialog(null,"É um retângulo com valor " + a + " " + b + " " + c + " " + d);
    }
    
}//fim da classe
