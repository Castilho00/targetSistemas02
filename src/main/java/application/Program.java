package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int numero = input.nextInt();

        int a=0, b=1, c;
        boolean pertence = false;

        if (numero == a || numero == b){
            pertence = true;
        }
        while (b <= numero){
            c = a + b;
            if(numero == c){
                pertence = true;
                break;
            }
            a = b;
            b = c;
        }

        if (pertence){
            System.out.println(numero + " pertence a sequencia de fibonacci");
        } else {
            System.out.println(numero + " nao pertence a sequencia de fibonacci");
        }

        input.close();
    }

}
