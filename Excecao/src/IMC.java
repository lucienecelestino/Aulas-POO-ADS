
import javax.swing.JOptionPane;


/**
 *
 * @author Luciene
 */
public class IMC {
    public static void main(String[] args) throws IMC_Excecao{
        String alturaS, pesoS;
        alturaS = JOptionPane.showInputDialog("Digite a sua Altura: ");
        pesoS = JOptionPane.showInputDialog("Digite seu Peso");
        
        float altura, peso, imc;
        
        try{// linhas passiveis de ocorrer a excecao
            altura = Float.parseFloat(alturaS);
            peso = Float.parseFloat(pesoS);
            
            imc = calcularIMC(altura,peso);
        }
        catch(IMC_Excecao erro){
            JOptionPane.showMessageDialog(null,"Segundo seu IMC - Você está : " + erro.toString());
       }
        finally{
            JOptionPane.showMessageDialog(null,"Fim da execução");
        }
       
    }//fim do main
    private static float calcularIMC(float altura, float peso) throws IMC_Excecao{
        float imc;
                imc = peso/(altura*altura);
        if (imc < 18.5)
            throw new IMC_Excecao();
        else if(imc <= 24.9)
            throw new IMC_Excecao(1);
        else if(imc <= 29.9)
            throw new IMC_Excecao(3.14159f);
        else if(imc <= 34.9)
            throw new IMC_Excecao("testando");
        else if(imc <= 39.9)
            throw new IMC_Excecao(1.1);
        else
            throw new IMC_Excecao(true);
    }
}
