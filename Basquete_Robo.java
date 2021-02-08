package estdados;
public class Basquete_Robo {
    Fig D;
    public void Distancia(int valor){
        D = new Fig();
        D.valor = valor;
        System.out.println(D.valor);
        System.out.println("--Possíveis Pontos--");
    }
    public void PontLancamento(){
        if(D.valor <= 400){
            System.out.println("1");
        }else if(D.valor > 400 && D.valor <= 1000){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
    }
    public static void main(String[] args) {
        Basquete_Robo b = new Basquete_Robo();
        b.Distancia(1720);
        b.PontLancamento();
    }
}
