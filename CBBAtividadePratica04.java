public class CBBAtividadePratica04 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i = 0; i < 200; i++ ){
            numbers[i] = i;
        }
        System.out.println("Imprimindo array...");
        for(int k = 0; k < 100; k++){
            System.out.println(numbers[k]);
        }
    }
}