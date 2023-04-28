public class CBBAtividadePratica05 {
    public static void main(String[] args){
        String[] dias ={"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        int i = 0;

        System.out.println("Utilizando o while...");
        while(i < dias.length){
            System.out.println(dias[i]);
            i++;
        }

        System.out.println("Utilizando o do-while...");
        i = 0;
        do {
            System.out.println(dias[i]);
            i++;
        } while(i < dias.length);

        System.out.println("Utilizando o for...");
        for(i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
        }
    }
}
