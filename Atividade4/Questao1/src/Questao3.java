package src;

import java.util.Objects;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        String usuario = "usuario";
        String senha = "senha123";
        String login;
        String key;
        System.out.println("Escreva seu usuário:");
        login = leia.nextLine();
        System.out.println("Escreva sua senha");
        key = leia.nextLine();

        if((Objects.equals(login, usuario))&&(senha.equals(key))){
            System.out.println("Login bem sucedido");
        }else{
            System.out.println("Nome de usuário ou senha incorretos");
        }
    }
}
