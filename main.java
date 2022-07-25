import java.util.Scanner;


class TreinoJava{

    public static void main(String[] args){
        /*Scanner scan = new Scanner(System.in);


        System.out.println("Digite seu nome  : ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é : " + nome);

        System.out.println("Digite seu Sobre nome :");
        String sobreNome = scan.next();
        System.out.println("Seu Sobre nome é : " + sobreNome);

        System.out.println("Digite aqui sua idade : ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é :" + idade);

        System.out.println("Digite sua altura :");
        double altura = scan.nextDouble();
        System.out.println("Sua altuta é :" + altura);

        System.out.println("Seu nome é : " + nome +  sobreNome + " você tem " + idade + " anos " + "com uma altura de :" + altura);*/
        
        //OPERADORES (Aritimédicos,Lógicos e Relacionais)
        /*int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);*/

        //OPERADORES RELACIONAIS
        /*int Valor1 = 1;
        int Valor2 = 2;

        System.out.println("valor1 == valor2 " + (Valor1 == Valor2));
        System.out.println("valor1 != valor2 " + (Valor1 != Valor2));
        System.out.println("valor1 > valor2 " + (Valor1 > Valor2));
        System.out.println("valor1 >= valor2 " + (Valor1 >= Valor2));
        System.out.println("valor1 < valor2 " + (Valor1 < Valor2));
        System.out.println("valor1 <= valor2 " + (Valor1 <= Valor2));*/


        /*int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 ==2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado  : " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado : " + resultado2);*/

        //EXERCICIOS01
        System.out.println("Seus exercicios");

        


        //EXERCICIOS02
        /*System.out.println("Digite um numero : ");
        int numero = scan.nextInt();
        System.out.println("O número digitado foi : " + numero);
        //EXERCICIOS03
        System.out.println("Digite o primeiro valor :" );
        int valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor :" );
        int valor2 = scan.nextInt();
        System.out.println(" A som dos valos são :" + valor1 + valor2);*/

        //EXERCICIOS04
        /*System.out.println("Primeira nota :");
        double N1 = scan.nextDouble();
        System.out.println("Segunda nota :");
        double N2 = scan.nextDouble();
        System.out.println("Terceira nota :");
        double N3 = scan.nextDouble();
        System.out.println("Quarta nota :");
        double N4 = scan.nextDouble();

        double NB = (N1 + N2 + N3 + N4 ) /4;

        System.out.println("Sua nota do bimestre é : " + NB);*/


        //EXERCICIOS05

        /*System.out.println("Entre com a quantidade de metros :");
        double metros = scan.nextDouble();

        //1m = 100 cm
        double  cm = metros * 100;
        System.out.println(metros +"m é igual a " + cm + "cm");*/


        //EXERCICIOS06

        /*System.out.println("Entre com o raio do circulo :");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do circulo é :" + area);*/

        //EXERCICIOS07

        /*System.out.println("Entre com o tamanha  do lado do quadrado :");

        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é :" + area);
        System.out.println("O dobro da área do quadrado é :" + (area * 2));*/


        //EXERCICIOS08

        /*System.out.println("Entre com valor da hora trabalhada :");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhada no mês :");
        double horaMes = scan.nextDouble();

        double salario = valorHora * horaMes;

        System.out.println("Seu salario do mês é :" + salario);*/



        //EXERCICIOS09

        /*System.out.println("Digite a temperatua em Farenheit");
        double f = scan.nextDouble();
        //Farenheit para Celsius
        double c = (5 * (f-32) /9);

        System.out.println("A temperatura " + f + " F é igual a " + c + " C ");*/


        //EXERCICIOS10
        /*Scanner scan = new Scanner(System.in);

        System .out.println("Digite a temperatura em graus Celsius");
        double c = scan.nextDouble();
        //Celsius para Farenheit
        double f = (c * 1.8) + 32;

        System.out.println("A temperatura " + c + "C é igual a " + f + " F ");*/


        //EXERCICIOS11
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro :");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero inteiro :");
        int num2 =scan.nextInt();

        System.out.println("Digite um número real :");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (2 /2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow (num3, 3);

        System.out.println("Resultado 1 :" + resultado1);
        System.out.println("Resultado 2 :" + resultado2);
        System.out.println("Resultado 3 :" + resultado3);*/

        //EXERCICIOS12
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura :");
        double altura = scan.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("O peso ideal é :" + peso);*/

        //EXERCICIOS13
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora ? :");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha no mês? :");
        double horaTrabalhada = scan.nextDouble();

        double salarioBruto = (valorHora * horaTrabalhada);
        double inss = (salarioBruto /100) * 8;
        double sindicato = (salarioBruto /100) * 5;
        double impostoDerenda = (salarioBruto /100) * 11;
        double totalDes = inss + sindicato + impostoDerenda;
        double salarioLiquido = salarioBruto - totalDes;

         System.out.println("Salario Bruto: " + salarioBruto);
         System.out.println("INSS: " + inss);
         System.out.println("SINDICATO: " + sindicato);
         System.out.println("IMPOSTO DE RENDA: " + impostoDerenda);
         System.out.println("TOTAL DE DESCONTO: " + totalDes);
         System.out.println("SALARIO LIQUIDO: " + salarioLiquido);*/

         //EXERCICIO14

         /*Scanner scan = new Scanner(System.in);

         System.out.println("Qual tamanho do arquivo em (MB): ");
         double mb = scan.nextDouble();

         System.out.println("Qual a velocidade da sua internet em (kbps): ");
         double velocidade = scan.nextDouble();

         double temp = mb / velocidade;

         System.out.println("Tempo estimado do Download: " + velocidade);*/
        

        








    }
}