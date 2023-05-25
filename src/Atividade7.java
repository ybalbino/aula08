import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        Scanner scannerSalarioBruto = new Scanner(System.in);

        System.out.print("Digite o valor do Salario Bruto:  ");float salarioBruto = scannerSalarioBruto.nextFloat();

        float ir = salarioBruto / 100 * 11;
        float inss = salarioBruto / 100 * 8;
        float sindicato = salarioBruto / 100 * 5;
        float salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Salario Bruto: "+ salarioBruto);

        System.out.println("Imposto de Renda: "+ ir);

        System.out.println("Inss: "+ inss);

        System.out.println("Sindicato: "+ sindicato);

        System.out.println("Salario Liquido: "+ salarioLiquido);}

}
