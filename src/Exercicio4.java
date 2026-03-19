import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do salario minimo");
        double salario = sc.nextDouble();
        System.out.println("O valor do salario é" + salario);
        // Valor de 100 quilowatts em reais //
        double quilowatts100 = salario/7;
        double quilowatts1 = quilowatts100/100;
        System.out.println("O valor em reais de cada quilowatts é =" + quilowatts1);
        // Valor a ser pago em quilowatts por uma casa //
        System.out.println("Quantidade de quilowatts consumido na casa é =");
        double casa = sc.nextDouble();
        // valor a ser pago em quilowatts em reais em uma casa//
        double reais = casa * quilowatts1;
        System.out.println("O valor a ser pago por uma casa é =" + reais);
        double desconto = reais * 0.10;
        System.out.println("O valor com desconto de 10 % é =" + desconto);
        sc.close();

    }
}
