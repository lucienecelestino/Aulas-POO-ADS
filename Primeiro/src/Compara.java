
/**
 * Classe para fazer comparações entre dois objetos
 * @author Luciene Celestino
 * @since Classe criada em 18/03/2026 - 11:39:15
 */
public class Compara {
    public Compara(Pessoa a, Pessoa b){
        compararPeso(a ,b);
        compararAltura(a ,b);
        compararIMC(a ,b);
        compararIdade(a ,b);
    }
    
    //método comparar peso
    public void compararPeso(Pessoa a, Pessoa b){
      if(a.peso > b.peso)  
            System.out.println(a.nome + " é mais pesado que " + b.nome);
      else if(a.peso < b.peso)
      System.out.println(b.nome + " é mais gordinho que " + a.nome);
      else
            System.out.println(a.nome + " e " + b.nome + "Tem pesos iguais");
    }
    
    //Método para comparar a altura de duas pessoas
     public void compararAltura(Pessoa a, Pessoa b){
        if(a.altura > b.altura)  
           System.out.println(a.nome + " é mais alto que " + b.nome);
         else if(a.altura < b.altura)
           System.out.println(b.nome + " é mais alto que " + a.nome);
         else
              System.out.println(a.nome + " e " + b.nome + "Tem alturas iguais");
        }
     
     
    //método para comparar o IMC de duas pessoas
    public void compararIMC(Pessoa a, Pessoa b){
        
          if(a.calcularIMC() > b.calcularIMC())  
           System.out.println(a.nome + " tem o IMC maior que  " + b.nome);
         else if(a.calcularIMC() < b.calcularIMC())
           System.out.println(b.nome + "  tem o IMC menor que " + a.nome);
         else
           System.out.println(a.nome + " e " + b.nome + "tem IMCs iguais");
        }
    
    //Método para determinar quem é a pessoa mais velha
        public void compararIdade(Pessoa a, Pessoa b){
        
           if(a.idade > b.idade)  
              System.out.println(a.nome + " é mais velho que  " + b.nome);
           else if(a.idade < b.idade)
              System.out.println(b.nome + "  é mais novo que " + a.nome);
           else
              System.out.println(a.nome + " e " + b.nome + "tem idades iguais");
        }
}
