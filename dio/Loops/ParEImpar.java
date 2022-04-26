package dio.Loops;

/*
  Faça um Programa que leia N números inteiros,
  calcule e mostre a quantidade de números pares
  e a quantidade de impares.
 */

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int qtdPares = 0,qtdImpares = 0 ;

        System.out.println("Quantidade de Números a ser Digitado: ");
        quantNumeros = scan.nextInt();


        do {
            System.out.println("Digite um Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                qtdPares = qtdPares + 1 ;
            else
                qtdImpares = qtdImpares + 1;

            count = count + 1;
        } while(count < quantNumeros);

        System.out.println("Quantidade de Números Pares: " +qtdPares);
        System.out.println("Quantidade de Números Impares: " +qtdImpares);

    }
}
