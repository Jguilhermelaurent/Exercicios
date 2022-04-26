package dio.Loops;


import java.util.Scanner;

/*
   Faça um Programa que leia 5 números
   e informe o maior número
   e a média desses números

 */
public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int  numero,media;
        int soma = 0;
        int  maior = 0;
        int count = 0 ;

        do {
            System.out.println("Digite o Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;
        } while(count < 5);

        media = (soma /5);
        System.out.println("Maior Número: " + maior);
        System.out.println("A Soma de todos os Números é: " + soma);
        System.out.println("Média de todos os Números é: " + media);

    }
}
