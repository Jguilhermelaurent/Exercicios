package dio.Loops;

import java.util.Scanner;

/*
  Faça um programa que leia conjuntos de dois valores,
  o primeiro representando o Nome do Aluno e o segundo representando a Idade.
  (pare inserindo o valor 0 no campo Nome)
 */
public class NomeEIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while( true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }


        System.out.println("Continua Aqui ......");


    }
}
