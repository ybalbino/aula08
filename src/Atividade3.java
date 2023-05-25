import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Metros? ");
        float metros = entrada.nextFloat();

        float centimetros = metros * 100;

        System.out.printf("%f metros são %f cm",metros, centimetros);

    }


}
