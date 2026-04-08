

/**
 * Classe para instânciar os objetos do tipo carro
 * @author Luciene Celestino
 * @since Classe criada em 01/04/2026 - 10:23:13
 */
public class Concessionaria {
    public static void main(String[] args) {
        //car é uma variavel de referencia que está em memória
        Carro car = new Carro("Volkswagen", "Gol", 2022, 75000f, "Rosa", true, 345, (float)1.6);
        car.exibirDadosCarro();
        
        Caminhao caminhao = new Caminhao("Volvo", "Volvo FH 540", 2025, (float)300000, 3, "trator", true, (float)9320);
        caminhao.exibirDadosCaminhao();
        
        //esse objeto pega as informações das caixas de dialogo
        Proprietario proprietario = new Proprietario();
        proprietario.exibirDadosProprietário();
        
        //Venda venda = new Venda(1234, "10/05/2025", car, proprietario);;
       // venda.exibirVenda();
        
        Venda vendacaminhao = new Venda(1234, "10/02/2026", caminhao, proprietario);
        vendacaminhao.exibirVenda();
    }//fim do main
}//fim da classe
