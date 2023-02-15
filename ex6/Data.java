package ex6;

public class Data {
    int ano;
    byte mes;
    byte dia;

    public int getAno(){
        return ano;
    }

    public void setAno(int a) {

        if(a > 0 ){
            ano = a;
        }
        else
        System.out.println("Ano invalido!");
    }
    
    public byte getDia(){
        return dia;
    }

    public void setDia(byte d) {
        if(d > 0 && d <= 31){
            dia = d;
        } else
        System.out.println("Dia invalido!");
    }

    public byte getMes(){
        return mes;
    }
    public void ajudarMes(byte m){
        if(m >0 && m<= 12){
            mes = m;
        }
        else
        System.out.println("Mes invalido");
    }

    public boolean isAnoBissexto(){
        if(((ano % 4 == 0)&& (ano % 100 != 0)) || (ano % 400==0))
                return true;

                else
                return false;
    }

    public void mostraAnoBi(){
        for(int i =0; i<2023;i+=4){
            if(((i % 4 == 0)&& (i % 100 != 0)) || (i % 400==0));
          
            System.out.println("Anos Bissexto são: " +i);

    }
}



    public void impressao(){
        System.out.println(+dia+"/"+mes+"/"+ano+ "\n" +isAnoBissexto() );
    }



}
