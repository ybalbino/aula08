import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double primeiraNota = entradaDoUsuario.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double segundaNota = entradaDoUsuario.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double terceiraNota = entradaDoUsuario.nextDouble();

        System.out.println("Digite a sua quarta nota: ");
        double quartaNota = entradaDoUsuario.nextDouble();

        double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("A média aritimétrica final é: " + mediaGeral);
    }

}
