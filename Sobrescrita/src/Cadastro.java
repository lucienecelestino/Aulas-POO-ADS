/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para...
 * @author Luciene Celestino
 * @since Classe criada em 22/04/2026 - 10:36:39
 */
public class Cadastro {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("\nGilberto", 45);
        Fisica f = new Fisica("Luciene", 24, 535353652, "B+", "maria", 172);
        
        Juridica j = new Juridica("DATAGRO", 50, 37747377, "DATAGRO", 810000000);
        p.exibirDados();
        f.exibirDados();
        f.exibirDados("x");
        j.exibirDados();
        j.exibirDados(1);
        
    }
}
