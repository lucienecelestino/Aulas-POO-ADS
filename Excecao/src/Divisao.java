
import javax.swing.JOptionPane;

/*
 * Classe para demonstrar um codigo pR trTmento de exceçÃO com as cláusulas "Try.... Catch... throws"
 * @author Luciene Celestino
 * @since Classe criada em 06/05/2026 - 09:43:27
 */
public class Divisao {
    public static void main(String[] args) throws DivisaoExcecao,AnaliseNumerisExcecao {
       String numeroA, numeroB;
       numeroA = JOptionPane.showInputDialog("Digite A");
       numeroB = JOptionPane.showInputDialog("Digite B");
        
        int a,b;
        float divisao = 0;
        
        try{//linhas passiveis de causar excecao
            a = Integer.parseInt(numeroA);
            b = Integer.parseInt(numeroB);
            divisao = dividir(a,b);
            JOptionPane.showMessageDialog(null,"Resultado da divisão " + divisao);
            
        }
        catch(ArithmeticException erro){// erro é uma variavel qualquer
            JOptionPane.showMessageDialog(null,"Erro de divisão por zero - VERIFIQUE");
        }
        catch(NumberFormatException erro){// erro é uma variavel qualquer
            JOptionPane.showMessageDialog(null,"Erro de entrada de números, digite apenas Números");
        }
        catch(DivisaoExcecao erro){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro do tipo - " + erro.toString());
        }
        catch(AnaliseNumerisExcecao erro){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro do tipo - " + erro.toString());
        }
        //excecao generica - SEMPRE O ÚLTIMO CATCH
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu uma excecao do tipo: " + erro.toString() + "entre em contato com o telefone xxxxxxx e informe o erro");
        }
        finally{
            JOptionPane.showMessageDialog(null,"Fim da execução");
        }
    }//fim do main

    //metodo dividir
    private static float dividir(int a, int b) throws DivisaoExcecao, AnaliseNumerisExcecao{//é statico poq não precisa de uma instancia para ser executado
        
        if(b > a){
            throw new DivisaoExcecao();//crinado uma nova excecao
        }
        if(a > 500){
            throw new DivisaoExcecao(1);
        }
        if(a < 0 || b < 0){
            throw new AnaliseNumerisExcecao();
        }
        if(a == b){
            throw new AnaliseNumerisExcecao(1);
        }
        if(b > 100){
            throw new AnaliseNumerisExcecao("teste");
        }
                return (float)a / b;
    }
}//fim da classe
