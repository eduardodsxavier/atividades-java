import java.util.Scanner;

public class ex5 {
    public static void main(String []args){
        byte numero = 0;
        String par;
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero: \r");
        numero = input.nextByte();
        par = numero%2==0 ? "o numero é par" : "o numero é impar";
        System.out.println(par);
        input.close();
    }
}
