import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //1
//        double valor1;
//        double valor2;
//        double valor3;
//        System.out.println("Digite o primeiro valor");
//        valor1 = leia.nextDouble();
//        System.out.println("Digite o Segundo valor");
//        valor2 = leia.nextDouble();
//        System.out.println("Digite o Terceiro valor");
//        valor3 = leia.nextDouble();
//
//        System.out.println("Total da soma dos 3 numeros: " + (valor1+valor2+valor3));

        //2
//        double num1;
//        double num2;
//
//        System.out.println("Digite o primeiro valor");
//        num1 = leia.nextDouble();
//        System.out.println("Digite o Segundo valor");
//        num2 = leia.nextDouble();
//
//        System.out.println("Total da subtração dos 2 numeros: " + (num1-num2));

        //3
//        double nota1;
//        double nota2;
//
//        System.out.println("Digite a primeira nota");
//        nota1 = leia.nextDouble();
//        System.out.println("Digite a Segunda nota");
//        nota2 = leia.nextDouble();
//        System.out.println("Total da media dos 2 numeros: " + ((nota1+nota2)/2));

        //4

//        double n1;
//        double n2;
//        double n3;
//        double n4;

//        System.out.println("Digite a primeira nota");
//        n1 = leia.nextDouble();
//        System.out.println("Digite a Segunda nota");
//        n2 = leia.nextDouble();
//        System.out.println("Digite a terceira nota");
//        n3 = leia.nextDouble();
//        System.out.println("Digite a quarta nota");
//        n4 = leia.nextDouble();
//        System.out.println("Total da media dos 4 numeros: " + ((n1+n2+n3+n4)/4));

        //5

//        double numero1;
//        double numero2;
//
//        System.out.println("Digite o primeirr numero");
//        numero1 = leia.nextDouble();
//        System.out.println("Digite o Segundo numero");
//        numero2 = leia.nextDouble();
//        System.out.println("A soma deles é: "+ (numero1+numero2));
//
//        System.out.println("A subtração deles é: "+ (numero1-numero2));
//
//        System.out.println("A divisão deles é: "+ (numero1/numero2));
//
//        System.out.println("A multiplicação deles é: "+ (numero1*numero2));

        //6
//        String nome;
//        double preco;
//        double percent;
//
//        System.out.println("Digite o nome do produto");
//        nome = leia.nextLine();
//        System.out.println("Digite o preço do produto");
//        preco = leia.nextDouble();
//        System.out.println("Digite o percentual de desconto");
//        percent = leia.nextDouble();
//        System.out.println("Nome do Produto :  " + nome );
//
//        System.out.println("Preço do Produto com o desconto : "+ (preco - (preco*percent/100)));
//        int x = 1;
//        int y =3;
//        if((x==3)||(y!=5)){
//            System.out.println("verdade");
//        }else{
//            System.out.println("falso");
        }

    double nu1;
    double nu2;
    double nu3;
    double nu4;
    double media;

        System.out.println("Digite a primeira nota");
    nu1 = leia.nextDouble();
        System.out.println("Digite a Segunda nota");
    nu2 = leia.nextDouble();
        System.out.println("Digite a terceira nota");
    nu3 = leia.nextDouble();
        System.out.println("Digite a quarta nota");
    nu4 = leia.nextDouble();
    media = ((nu1+nu2+nu3+nu4)/4)
            System.out.println("Total da media dos 4 numeros: " + media );
    }
}