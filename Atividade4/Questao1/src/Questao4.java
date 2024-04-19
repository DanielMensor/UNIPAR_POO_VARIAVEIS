package src;

import java.util.Objects;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Escreva o primeiro numero:");
        num1 = leia.nextInt();
        System.out.println("Escreva o segundo numero");
        num2 = leia.nextInt();

        if (num1 > num2) {
            System.out.println("Primeiro numero maior que o segundo");
        } else if (num1 == num2) {
            System.out.println("Numeros iguais");
        }else{
            System.out.println("Segundo numero maior que o primeiro");
        }

    }
}
