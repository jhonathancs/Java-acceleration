public class ExplicacaoFor2 {
    public static void main(String[] args) {
        String nomes[] = new String[] {"marcos","fernanda","jhon"};

        for(String pessoas : nomes) {
            imprimeMensagem(pessoas);
        }
        // for(int i = 0; i < nomes.length; i++) {
        //     imprimeMensagem(nomes[i]);
        // }
    
    }
    
    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
