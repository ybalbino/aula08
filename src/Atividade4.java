import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner quantidade = new Scanner(System.in);

        System.out.print("Quantidade de Horas:  ");float quantidadeDeHoras = quantidade.nextFloat();

        Scanner valor = new Scanner(System.in);

        System.out.print("Valor da Horas:  ");float valorDeHoras = valor.nextFloat();
        Float salario = quantidadeDeHoras * valorDeHoras;

        System.out.printf("Salario = R$ %.2f", salario );
    }
}
