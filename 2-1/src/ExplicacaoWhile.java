public class ExplicacaoWhile {
    public static void main(String[] args) {
        int numeroInscritos = 100;
        int numeroCupons = 50;
        int primeirosInscr = 0;

        while (primeirosInscr - 1 < numeroCupons) {
            imprimeMensagem("inscritos de numero:" + primeirosInscr  + "ganhou o cupon" );
            primeirosInscr++;
        }
        imprimeMensagem(numeroInscritos + " pessaos inscritas.");
    }
    
    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
