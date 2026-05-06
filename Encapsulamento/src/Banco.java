/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para instanciar objetos do tipo conta corrente
 * @author Luciene Celestino
 * @since Classe criada em 29/04/2026 - 09:59:39
 */
public class Banco {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("Luciene Celestino", 12345, 100000, 123456);
        cc.exibirDadosContaCorrente();
        //antes de fazer o encapsulamento era possivel alterar estando dentro de outra classe
        // cc.saldo = 30000;
        
        cc.realizarDeposito(300);
        cc.exibirDadosContaCorrente();
        cc.realizarSaque();
        cc.exibirDadosContaCorrente();
        cc.mudarSenha();
        cc.realizarSaque();
        cc.exibirDadosContaCorrente();
    }//fim do main
}//fim da classe
