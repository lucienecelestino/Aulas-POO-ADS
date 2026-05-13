
/**
 *
 * @author Luciene
 */
public class IMC_Excecao extends Exception{
    public IMC_Excecao(){
        super("Abaixo do Peso Normal");
    }
       public IMC_Excecao(int x){
        super("Peso Normal");
    }
       public IMC_Excecao(float y){
        super("Excesso de Peso");
    }
       public IMC_Excecao(String teste){
        super("Obsesidade Grau I");
    }
        public IMC_Excecao(double o){
        super("Obsesidade Grau II");
    }
        public IMC_Excecao(boolean z){
        super("Obsesidade Grau III");
    }
}
