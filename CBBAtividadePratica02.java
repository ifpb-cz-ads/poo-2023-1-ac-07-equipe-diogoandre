public class CBBAtividadePratica02{
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 1 ; i <= 100; i++){
            arr[i-1] = i;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}