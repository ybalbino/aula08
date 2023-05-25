import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner scannerFahrenheit = new Scanner(System.in);

        System.out.print("Qual temperatura em graus Fahrenheit:  ");float Fahrenheit = scannerFahrenheit.nextFloat();

        double Celsius = (Fahrenheit - 32.0)/ 1.8;

        System.out.printf("%.2f Fahrenheit são %.2f Celsius",Fahrenheit, Celsius);
    }
}
