// Classe para gerar objetos do tipo cliente AQUI TEM TUDO QUE TEM NO FORMULARIO
public class Cliente {
    String nome;
    String cpf;
    String nascimento;
    String estado;
    String sexo;
    String Observacoes;
    boolean esportes;
    boolean videoGame;
    boolean leitura;
    boolean danca;
    boolean luta;
                                   
    //Contrutor Vazio
    public Cliente(){
        
    }
    //contrutor do objeto cliente em memoria
    
    //atalho fora da classe, botao direito, inserir codigo, contrutor 
    public Cliente(String nome, String cpf, String nascimento, String estado, String sexo, String Observacoes, boolean esportes, boolean videoGame, boolean leitura, boolean dança, boolean luta) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.estado = estado;
        this.sexo = sexo;
        this.Observacoes = Observacoes;
        this.esportes = esportes;
        this.videoGame = videoGame;
        this.leitura = leitura;
        this.danca = danca;
        this.luta = luta;
    }
    
}
