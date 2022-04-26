package dio.Arrays;

/*
  Crie um vetor de 6 números
  e mostre-os na ordem inversa.
*/

public class OrdemInversa {

    public static void main(String[] args) {

        int count = 0;
        int[] vetor = { -5, 4, -6 , 8 , 50 , 15 };

        System.out.print("\nVetor: ");
        while( count < (vetor.length ) ){
            System.out.print(vetor[count] + " ");
            count ++;
        }

        System.out.print("\nVetor Invertido: ");
        for( int i = vetor.length - 1; i >= 0 ; i --){
            System.out.print(vetor[i] + " ");
        }

    }
}
