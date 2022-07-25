import java.util.Scanner;

public class condicional {
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);

        //System.out.println("Digite um valor (1 a 7) para saber o dia da semana: ");
        //int diaDaSemana = scan.nextInt();

        /*if (diaDaSemana == 1){
            System.out.println("Domingo");

        } else if(diaDaSemana == 2){
            System.out.println("Segunda-Feira");
        } else if (diaDaSemana == 3){
            System.out.println("Terça-Feira");
        } else if (diaDaSemana == 4){
            System.out.println("Quarta-Feira");
        } else if (diaDaSemana == 5){
            System.out.println("Quarta-Feira");
        } else if (diaDaSemana == 6){
            System.out.println("Sexta-Feira");
        } else if (diaDaSemana == 7){
            System.out.println("Sábdo");
        } else {
            System.out.println("Não é um dia da semana valido !");
        }*/
        //TERA A MESMA SAIDA DO IF/ ELSE IF QUE ESTA LOGO ACIMA
        /*switch(diaDaSemana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-Feira"); break;
            case 3: System.out.println("Terça-Feira"); break;
            case 4: System.out.println("Quarta-Feira"); break;
            case 5: System.out.println("Quarta-Feira"); break;
            case 6: System.out.println("Sexta-Feira"); break;
            case 7: System.out.println("Sábdo"); break;
            default: System.out.println("Não é um dia da semana valido !");



        }*/
        //EXERCICIO: IMPRIMIR MAIOR VALOR!
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu valor: ");
        double valor1 = scan.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scan.nextDouble();

        if(valor1 > valor2){
            System.out.println("O valor um é maior : " + valor1);
        } else {
            System.out.println("O valor dois é maior : " + valor2);
        }*/
        //EXERCICIO: INFORMAR SE O VALOR É POSITIVO OU NEGATIVO
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu valor: ");

        double valor = scan.nextDouble();

        if(valor >= 0){
            System.out.println("O valor é positivo ");

        } else {
            System.out.println("O valor é negtivo ");
        }*/

        //EXERCICIO: INFORMA DE ACORTO COM A LETRA DE ENTRA O SEXO. (O (equlsIgnoreCase, passa a ignorar a lentra se sera Maiuscula ou Minuscula))

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra (F) ou (M): ");

        String input = scan.nextLine();

        if(input.equalsIgnoreCase("f")){
            System.out.println("F- Feminino ");

        } else if(input.equalsIgnoreCase("M")){
            System.out.println("M- Masculino");
        }else {
            System.out.println("Sexo invalido");
        }
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma lettra: ");
        String l = scan.next();
                


    }       
}
