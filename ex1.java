import java.util.Scanner;

public class ex1 {
    public static void main(String [] args){
        byte numeroMes = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("digite um numero de 1 a 12: ");
        numeroMes = input.nextByte();
        switch (numeroMes){
            case 1:
                System.out.println("O numero "+numeroMes+" é correspondente ao més janeiro");
                break;
            case 2:
                System.out.println("O numero "+numeroMes+" é correspondente ao més fevereiro");
                break;
            case 3:
                System.out.println("O numero "+numeroMes+" é correspondente ao més março");
                break;
            case 4:
                System.out.println("O numero "+numeroMes+" é correspondente ao més abril");
                break;
            case 5:
                System.out.println("O numero "+numeroMes+" é correspondente ao més maio");
                break;
            case 6:
                System.out.println("O numero "+numeroMes+" é correspondente ao més junho");
                break;
            case 7:
                System.out.println("O numero "+numeroMes+" é correspondente ao més julho");
                break;
            case 8:
                System.out.println("O numero "+numeroMes+" é correspondente ao més agosto");
                break;
            case 9:
                System.out.println("O numero "+numeroMes+" é correspondente ao més setembro");
                break;
            case 10:
                System.out.println("O numero "+numeroMes+" é correspondente ao més outubro");
                break;
            case 11:
                System.out.println("O numero "+numeroMes+" é correspondente ao més novembro");
                break;
            case 12:
                System.out.println("O numero "+numeroMes+" é correspondente ao més dezembro");
                break;
            default:
                System.out.println("O numero "+numeroMes+"não esta entre 1 e 12");
                break;
        
        }
        input.close();
    }
}
