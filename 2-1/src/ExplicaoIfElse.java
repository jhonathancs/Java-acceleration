import java.util.Random;

public class ExplicaoIfElse {
    public static void main(String[] args) {
        int resultado = resultadoTeste();
        if (resultado >= 7) {
            imprimeMensagem("Parabéns, passou! sua nota foi " + resultado);
        } else {
            imprimeMensagem("Reprovado. sua nota foi " + resultado);
        } 
    }

    static int resultadoTeste() {
        Random random = new Random();
        return random.nextInt(10);
    }

    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
