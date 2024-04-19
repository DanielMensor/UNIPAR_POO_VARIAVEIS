import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        String sobrenome;
        int idade;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu nome:");

        nome = s.nextLine();
        System.out.println("Informe o Sobrenome: ");
        sobrenome = s.nextLine();

        System.out.println("Nome: " + nome + " " + sobrenome);

        System.out.println("Informe a idade: ");
        idade = s.nextInt();
        System.out.println("idade: " + idade);

        s.close();
    }
}