/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para instanciar objetos do tipo eletrodomestico(TV e Microondas) e colocar para funcionar
 * @author Luciene Celestino
 * @since Classe criada em 13/05/2026 - 11:07:44
 */
public class Casa {
    public static void main(String[] args) throws InterruptedException {
        Microondas m = new Microondas();
        //m.ligar(15);
        //m.pipoca();
       // m.descongelarAlimentod();
      // m.usuarioEscolheTempo();
       
       Televisao tv = new Televisao();
       //tv.soneca();
      // tv.ligar();
       //tv.desligar();
       
       Liquidificador l = new Liquidificador();
       l.Velocidade();
    }

}
