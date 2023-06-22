import java.math.BigDecimal;
import java.util.Scanner;

class UsandoScanner {

    public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        BigDecimal n1 = scanner.nextBigDecimal();
        System.out.print("Entre com o segundo número: ");
        BigDecimal n2 = scanner.nextBigDecimal();

        BigDecimal resultado = n1.add(n2);
        System.out.println("O resultado da soma é: " + resultado);
        scanner.close();
    }

}
