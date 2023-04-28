public class CBBAtividadePratica03 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = i;
        }
        System.out.println("Imprimindo array...");
        for(int k = 0; k < numbers.length; k++){
            System.out.println(numbers[k]);
        }
    }
}
