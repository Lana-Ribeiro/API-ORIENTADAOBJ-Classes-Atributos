package ex3;

public class Carro {
    String marca,modelo,ano,cor;

    

    float tentativa;

    float senha = 123 ;
  

       void cadastrarMarca(String marca){
  
          this.marca=marca;
      }
      void cadastrarModelo(String modelo){
  
          this.modelo=modelo;
      }
      void cadastrarAno(String ano){
  
        this.ano=ano;
    }
    void cadastrarCor(String cor){
  
        this.cor=cor;
    }




  
      String lerMarca(){
  
          return marca;
      }

      String lerModelo(){
  
         return modelo;
      }

      String lerAno(){
  
          return ano;
      }
    
      String lerCor(){
  
        return cor;
    }

    Float lerTentativa(){
  
        return tentativa;
    }
  

    public void onooff(){
        if (tentativa == senha){
            System.out.println("Ligado!");
        } else{
            System.out.println("Senha incorreta, carro Desligado");;
        }
    }
  
  
      public void impressao() {
  
             System.out.println("\nMarca: " +marca+  "\nModelo: "+modelo + "\nAno: "+ano+ "\nCor: "+cor);
          
      }
}
