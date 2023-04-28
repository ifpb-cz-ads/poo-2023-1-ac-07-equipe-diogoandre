import java.util.Random;

public class CTAtividadePratica03 {
    public static void main(String[] args) {
        int[] notas;
        
        notas = new int[10];
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            notas[i] = rand.nextInt(11);
        }

        int soma = 0, quant = 0;

        for(int i : notas){
            soma += i;
            quant++;
        }

        double media = soma/quant;
        int acima = 0, abaixo = 0;
        for(int i : notas){
            if(i >= media){
                acima++;
            }else if (i < media){
                abaixo++;
            }
        }

        System.out.println("Média: "+ media);
        System.out.println("Quantidade de notas acima: "+acima);
        System.out.println("Quantidade de notas abaixo: "+abaixo);
    }
}
