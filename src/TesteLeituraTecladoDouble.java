import java.util.Scanner;

public class TesteLeituraTecladoDouble {

    public static void main(String[] args) {
        double dadoDoubleDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo double e tecle enter:");
        dadoDoubleDigitado = scanner.nextDouble();

        System.out.printf("O dado do tipo double digitado foi: %.16f", dadoDoubleDigitado);
    }
}
