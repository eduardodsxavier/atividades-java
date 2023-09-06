import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner input = new Scanner(System.in);
        System.out.println("digite o primeiro lado do triangulo:");
        lado1 = input.nextInt();
        System.out.println("digite o segundo lado do triangulo:");
        lado2 = input.nextInt();
        System.out.println("digite o terceiro lado do triangulo:");
        lado3 = input.nextInt();
        boolean trinagulo = ((lado1-lado2) < lado3 && lado3 < (lado1+lado2)) 
        && ((lado2-lado3) < lado1 && lado1 < (lado2+lado3))
        && ((lado1-lado3) < lado2 && lado2 < (lado1+lado3));
        if (trinagulo == true){
            boolean escaleno = lado1 != lado2 && lado2 != lado3 && lado1 != lado3;
            boolean equilatero = lado1 == lado2 && lado2 == lado3 && lado1 == lado3;
            if (escaleno == true)
                System.out.println("Os lados formam um triangulo escaleno");
            else if (equilatero == true)
                System.out.println("Os lados formam um triangulo equilatero");
            else 
                System.out.println("Os lados formam um triangulo isosceles");
            
            
        } else
            System.out.println("os lados não formam um triangulo");
        input.close();        
    }
}