import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){

        Scanner scannernumero = new Scanner(System.in);

        System.out.print("Excreva um numero:  "); int numero = scannernumero.nextInt();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.printf("Antecessor %d numero %d Sucessor %d", antecessor, numero, sucessor);

    }

}
