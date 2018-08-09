
package aula5;
public class Aula5 {
    public static void main(String[] args) {
       
       ContaBanco c1 =  new ContaBanco();
       c1.setNumConta(123456);
       c1.setDono("Albertt");
       c1.abrirConta("CC");
       c1.depositar(1000);
       
       ContaBanco c2 = new ContaBanco();       
       c2.setDono("Creuza");
       c2.setNumConta(2222);
       c2.abrirConta("CP");
       c2.depositar(150);
            
       c1.statusAtual();
       c2.statusAtual();
       
        
        
    }
    
}
