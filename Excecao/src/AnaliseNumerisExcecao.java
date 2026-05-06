/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para trtar excecoes da clase divisao
 * @author Luciene Celestino
 * @since Classe criada em 06/05/2026 - 10:52:25
 */
public class AnaliseNumerisExcecao extends Exception {

    public AnaliseNumerisExcecao() {
        super("Número negativo, digite apenas números positivos");
    }
    public AnaliseNumerisExcecao(int x) {
           super("Numeros iguais, digite números diferentes");
    }
    public AnaliseNumerisExcecao(String y) {
           super("B é maior que 100, digite numeros menores que 100 para B");
    }

}
