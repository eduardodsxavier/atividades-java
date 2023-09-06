import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String []args){
        int[] numeros = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<numeros.length;i++){
            System.out.println("digite um numero:");
            numeros[i] = input.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        input.close();
    }
}
