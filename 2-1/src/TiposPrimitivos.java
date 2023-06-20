public class TiposPrimitivos {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int soma = a + b;
        int sub = a - b;
        int multi = a * b;
        int divisao = a / b;
        int restoDivisao = a % b;

        System.out.println(soma); //30 
        System.out.println(sub); //10 
        System.out.println(multi); //200
        System.out.println(divisao); //2
        System.out.println(restoDivisao); //0

        float numA = -101.23f;
        float numB = 2.356f;
        System.out.println(numA + numB); // -98.874

        char letrac = 'c';
        char letraC = 'C';
        
        System.out.println(letrac == letraC); //false

    }
}
