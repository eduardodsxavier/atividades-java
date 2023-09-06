import java.util.Scanner;

public class ex12 {
    public static void main(String []args){
        int a = 0, b = 0, c = 0, d = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero:");
        a = input.nextInt();
        System.out.println("digite um numero:");
        b = input.nextInt();
        System.out.println("digite um numero:");
        c = input.nextInt();
        System.out.println("digite um numero:");
        d = input.nextInt();

        if (a%2==0 && a%3==0)
            System.out.println(a + " é divisivel por 2 e 3");
        if (b%2==0 && b%3==0)
            System.out.println(b + " é divisivel por 2 e 3");
        if (c%2==0 && c%3==0)
            System.out.println(c + " é divisivel por 2 e 3");
        if (d%2==0 && d%3==0)
            System.out.println(d + " é divisivel por 2 e 3");
            
        input.close();
    }
}
