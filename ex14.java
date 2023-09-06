import java.util.Scanner;

public class ex14 {
    public static void main(String []args){
        int numero;
        Scanner  input  =  new Scanner(System.in);

        System.out.println("digite um numero: ");
        numero = input.nextInt();

        String maior30 = (numero*2) >30 ? "numero digitado multiplicado por 2 é: "+numero*2 : "";

        System.out.println(maior30);
        
        input.close();
    }
}
