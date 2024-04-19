package src;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {



        Scanner leia = new Scanner(System.in);
        int num;
        System.out.println("Escreva um numero");
        num = leia.nextInt();

        if((num%2)==0){
            System.out.println("O numero é par");
        }else {
            System.out.println("o numero é impar");
        }




    }
}
