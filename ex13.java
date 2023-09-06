import java.util.Scanner;

public class ex13 {
    public static void main(String []args){
        int numero= 0;
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        numero = input.nextInt();

        String menor3 = !(numero >3) ? "numero digitado: "+numero : "";

        System.out.println(menor3);
        
        input.close();
    }
}
