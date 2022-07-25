import java.util.Scanner;
public class decisao {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // DECISÃO NA COMPRA DO PRODUTO  MAIS PARATO 

        System.out.println("Digite o valor do item: ");
        double Value = scan.nextDouble();

        if(Value <= 10){
            System.out.println("Pode compra esta barato!");
        } else if (Value > 10 && Value < 15){
            System.out.println("Da pra pedir um desconto");
        } else if (Value >= 15 && Value < 17){
            System.out.println("Pesquise mais, esta caro!");
        } else {// Value >= 17
            System.out.println("Caro de mais !");

        }


        


    }
}
