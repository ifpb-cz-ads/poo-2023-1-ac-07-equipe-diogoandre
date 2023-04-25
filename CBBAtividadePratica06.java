import java.util.Scanner;

public class CBBAtividadePratica06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []numbers = new int[10];
        System.out.println("Informe dez numeros inteiros:");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Imprimindo numeros informados...");
        for(int k = 0; k < numbers.length; k++){
            System.out.println(numbers[k]);
        }
    }
}
