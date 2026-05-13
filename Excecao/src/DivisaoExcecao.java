/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para o tratamento personalizado para as excecoes da classe divisão
 * @author Luciene Celestino
 * @since Classe criada em 06/05/2026 - 10:30:50
 */
public class DivisaoExcecao extends Exception {// a classe exception, é própria do java

    public DivisaoExcecao() {
        super("O valor de B, não pode ser maior que o valor de A");
    }
    //sobrecarga
    public DivisaoExcecao(int x) {
        super("O valor de A, não pode ser maior que 500");
    }

}
