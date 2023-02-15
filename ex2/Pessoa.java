package ex2;

public class Pessoa {
    String nome, idade;
    float andar;

   
  
       void cadastrarNome(String nome){
  
          this.nome=nome;
      }
      void cadastrarIdade(String idade){
  
          this.idade=idade;
      }
  
      String lerNome(){
  
          return nome;
      }
      String lerIdade(){
  
         return idade;
      }
  
      void cadastrarAndar(Float andar){
  
          this.andar=andar;
      }
    
      float lerAndar(){
  
          return andar;
      }
    
  
  
  
      public void impressao() {
  
             System.out.println("\nNome: " +nome+  "\nIdade: "+idade + "\nquantos km vc andou: "+andar);
          
      }
  
}
