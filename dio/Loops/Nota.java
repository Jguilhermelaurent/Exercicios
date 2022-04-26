package dio.Loops;

/*
   Faça um Programa que receba uma nota, entre 0 e 10.
   Mostre uma Mensagem caso o valor seja inválido.
   continue pedindo.
   até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe a Nota:");
        nota = scan.nextInt();

        while ( nota < 0 || nota > 10){
            System.out.println("Nota Inválida! Digite novamente a Nota: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota Válida: ");
    }
}
