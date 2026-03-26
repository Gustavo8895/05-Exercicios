import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, centena, dezena ,unidade,valorInvertido;
        System.out.println("digite o numero de 3 digitos " );
        num = sc.nextInt();
        unidade = num % 10;
        dezena = num / 10 % 10;
        centena = num / 100;
        valorInvertido = unidade*100 + dezena* 10 + centena;
        System.out.println( " Valor do numnero invertido  " + valorInvertido);
    }
}
