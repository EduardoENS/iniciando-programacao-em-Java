// 5- Ler uma quantidade não determinada de pares de números [m, n] todos inteiros e positivos. Para cada par lido, o programa deve calcular e mostrar a soma de todos os números inteiros entre m e n (inclusive). A digitação terminará quando o usuário digitar valores para m e n tais que m >= n.

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String args[]){
        
        int i = 0;
        int m;
        int n;
        int aux;
        int soma = 0;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println((i+1) + "o Par: ");
            
            System.out.println("Digite primeiro número: ");
            m = scan.nextInt();

            System.out.println("Digite o segundo número: ");
            n = scan.nextInt();
            
                if(m < n){
                    System.out.print("A soma dos numeros entre " + m + " e " + n + " resulta em: ");
                    soma = n;
                    aux = m;
                while(aux < n){
                    soma += aux;
                    aux++;
                }
                System.out.println(soma);
                System.out.println();
                
                i++;
                } else{
                    System.out.println("O segundo numero deve ser maior que o primeiro");
                }
        }while(m < n);
        
    }
}