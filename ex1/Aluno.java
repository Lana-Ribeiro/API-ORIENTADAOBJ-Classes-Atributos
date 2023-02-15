package ex1;


public class Aluno {

  String nome,ra;
  float notaPi;
float notaAp;
 

     void cadastrarNome(String nome){

        this.nome=nome;
    }
    void cadastrarRa(String ra){

        this.ra=ra;
    }

    String lerNome(){

        return nome;
    }
    String lerRa(){

       return ra;
    }

    void cadastrarNotaPi(Float notaPi){

        this.notaPi=notaPi;
    }
    void cadastrarNotaAp(Float notaAp){

        this.notaAp=notaAp;
    }

    float lerNotaPi(){

        return notaPi;
    }
    float lerNotaAp(){

       return notaAp;
    }



    public void impressao() {

            System.out.println("\nNome: " +nome+  "\nRa: "+ra+ "\nNota API: " +notaPi+  "\nNota Apresentação: "+notaAp+ "\nMedia "+media(notaPi, notaAp));
        
    }

    public float media(float notaPi, float notaAp){
        return(notaAp+notaPi/2);
    }
}
