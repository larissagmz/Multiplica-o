public class exercicio {

    static void calcularNumero(int A, int B){
       int soma = 0;
        for(int i = 0; i < B; i++){
             soma += A;
        }
        System.out.printf("%d X %d = %d", A, B, soma);
    }
}
