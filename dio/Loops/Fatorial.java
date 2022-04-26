package dio.Loops;

/*
   Faça um programa que calcule o fatorial de um número fornecido pelo usuário.
   Ex: 5!= 120
 */

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + " ! = " );
        for ( int i = fatorial ; i >= 1 ; i = i - 1 ){
            multiplicacao = multiplicacao * i;

        }
        System.out.println(multiplicacao);

    }
}
