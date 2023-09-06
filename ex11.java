import java.util.Scanner;

public class ex11 {
    public static void main(String []args){
        int a = 0, b = 0, c = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero");
        a = input.nextInt();
        System.out.println("digite um numero");
        b = input.nextInt();
        System.out.println("digite um numero");
        c = input.nextInt();
        if(a>b && a>c)
            System.out.println(a + " foi o maior numero digitado");
        else if(b>c)
            System.out.println(b + " foi o maior numero digitado");   
        else 
            System.out.println(c + " foi o maior numero digitado"); 
        input.close();
    }
}
