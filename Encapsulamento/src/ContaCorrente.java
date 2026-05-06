
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para gerar objetos
 * @author Luciene Celestino
 * @since Classe criada em 29/04/2026 - 09:54:41
 */
public class ContaCorrente {
   private String cliente;
   private int numeroConta;
   private float saldo;
   private int senha;
   private boolean contaBloqueada = false;
   int contador = 0;

   /*
        MODDIFICADORES DE VISIBILIDADE (4Ps):
        
        public - defalt - dado prostituido, todos twm acesso
        private - de acesso privado á classe que ele pertence
        protected - proteger atributos dentro de uma estrutura de herança
        packge - dados com acesso dentro de todo os programas do pacote
   
   */
   
   
    public ContaCorrente(String cliente, int numeroConta, float saldo, int senha) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    
    //Método comum para exibir os dados da conta
    public void exibirDadosContaCorrente(){
        System.out.println("Cliente: " + cliente);
        System.out.println("Conta Corrente: " + numeroConta);
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Senha: " + senha);
    }
    
    //Métodos para alterar o saldo da conta do cliente
    public void realizarDeposito(float valorDeposito){
       // outra forma - 
        /*
             float saldoAnterior = getSaldo();
             float novoSaldo = saldoAnterior + valorDeposito;
             setSaldo(novoSaldo);
        */
        
        setSaldo(getSaldo() + valorDeposito);
    }
    
    //Método para realizar saque de valores em uma conta corrente alterando o saldo
    public void realizarSaque(){
        if(solicitarSenha() == false){
            JOptionPane.showMessageDialog(null,"Senha inválida, Saque não realizado !!");
        }else
        {
            float valorSaque;
            valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a Sacar: "));
            setSaldo(getSaldo()- valorSaque);
        }
    }
    
    //método para conferir a senha
   
    public boolean solicitarSenha(){
        int senhaDigitada;
        senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Senha: "));
        
        
         for (int i = 0; i < 2; i++){
             if(verificarSenha(senhaDigitada) == false){
             System.out.println("senha invalida!! ");
             senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
             
             }else
                 return true;
         
           
    }
         System.out.println("Bloqueada");
         setContaBloqueada(true);
         return false;
    }
    
    //Método verificar senha
    public boolean verificarSenha(int senhaDigitada){
        
        if(senhaDigitada == getSenha()){
            return true;
        }else{
            return false;
        }
        
    }
   
    
    
  public void mudarSenha(){
    JOptionPane.showMessageDialog(null, "Alterando Senha");

    if(!solicitarSenha()){
        JOptionPane.showMessageDialog(null, "Não foi possível alterar a senha!");
        return;
    }

    int novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Nova Senha: "));
    int confirmarSenha = Integer.parseInt(JOptionPane.showInputDialog("Confirme a nova Senha: "));

    if(novaSenha == confirmarSenha){
        setSenha(novaSenha);
        System.out.println("Senha alterada");
    } else {
        System.out.println("As senhas não são iguais!");
    }
}
    //Métodos asseores getters e setters
    // --  SET -- guarda e insere a informação do atributo
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    // -- GET -- tras a informação
    private float getSaldo(){
        return this.saldo;
    }

    public boolean isContaBloqueada() {
        return contaBloqueada;
    }

    public void setContaBloqueada(boolean contaBloqueada) {
        this.contaBloqueada = contaBloqueada;
    }
    
        // --  SET -- guarda e insere a informação do atributo
    private void setSenha(int senha){
        this.senha = senha;
    }
    
    // -- GET -- tras a informação
    private int getSenha(){
        return this.senha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
}
