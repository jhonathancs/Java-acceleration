public class Imc {
    public void calcularImc(double peso, double altura) {
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("o seu imc é " + IMC);
    }
}
