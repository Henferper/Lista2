import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3;
        System.out.println("Digite o primeiro valor: ");
        valor1 = in.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = in.nextInt();
        System.out.println("Digite o terceiro valor: ");
        valor3 = in.nextInt();

        int[] numbers = {valor1, valor2, valor3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
