import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // declarando vaiaveis//
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println( "Numero de tres digitos ");
        num= sc.nextInt();
        num= (num/10) % 10;
        System.out.println("O numero da dezena= " + num );

    }
}
