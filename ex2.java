import java.util.Scanner;

public class ex2 {
    
    public static void main(String []args){
        byte numeroSemana = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("digite um numero de 1 a 7: ");
        numeroSemana = input.nextByte();
        switch (numeroSemana){
            case 1:
                System.out.println("O numero "+numeroSemana+" é correspondente a domingo");
                break;
            case 2:
                System.out.println("O numero "+numeroSemana+" é correspondente a segunda");
                break;
            case 3:
                System.out.println("O numero "+numeroSemana+" é correspondente a terça");
                break;
            case 4:
                System.out.println("O numero "+numeroSemana+" é correspondente a quarta");
                break;
            case 5:
                System.out.println("O numero "+numeroSemana+" é correspondente a quinta");
                break;
            case 6:
                System.out.println("O numero "+numeroSemana+" é correspondente a sexta");
                break;
            case 7:
                System.out.println("O numero "+numeroSemana+" é correspondente a sabado");
                break;
            default:
                System.out.println("O numero "+numeroSemana+" não esta entre 1 e 7");
                break;
        }
        input.close();
    }
}
/*Faça um programa, usando o comando switch, em que receba um número de 1 a 7 e
devolva o dia da semana.*/

