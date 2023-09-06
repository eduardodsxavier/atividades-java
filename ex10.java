import java.util.Scanner;

public class ex10 {

    public static void main(String [] args) {
        int a, b, c, delta;
        float raiz1 = 0, raiz2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor de a:");
        a = input.nextInt();
        System.out.println("digite o valor de b:");
        b = input.nextInt();
        System.out.println("digite o valor de c:");
        c = input.nextInt();
        delta = (b * b) - (4 * a * c);
        raiz1 = ( -b + (float) Math.sqrt(delta))/(2*a);
        raiz2 = ( -b - (float) Math.sqrt(delta))/(2*a);
        if (delta >= 0)
            System.out.println("a primeira raiz e: "+ raiz1 + "\na segunda raiz e: " + raiz2);
        else 
            System.out.println("equação não possui raiz real");
        input.close();
    }
}
