import java.util.Scanner;

public class ImcDiagnotico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        String peso = scanner.next();
        System.out.print("Digite sua altura: ");
        String altura = scanner.next();

        double pesoEx = Double.parseDouble(peso);
        double alturaEx = Double.parseDouble(altura);

        Imc instanciaAvaliacao = new Imc();
        instanciaAvaliacao.calcularImc(pesoEx, alturaEx);
        scanner.close();
    }

}
