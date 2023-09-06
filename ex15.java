import java.util.Scanner;

public class ex15 {
    public static void main(String []args){
        int a = 0, b = 0, c = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        a = input.nextInt();
        System.out.println("digite um numero: ");
        b = input.nextInt();
        System.out.println("digite um numero: ");
        c = input.nextInt();
        
        String maior100 = a+b+c > 100 ? "a soma dos 3 valores é igual a: "+ (a+b+c) : "";

        System.out.println(maior100);
        
        input.close();
    }
}
