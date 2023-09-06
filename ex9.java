import java.util.Scanner;

public class ex9 {
    
    public static void main(String []args){
        float nota1,nota2;
        Scanner input = new Scanner(System.in);
        System.out.println("digite a sua nota no primeiro semestre: ");
        nota1 =input.nextFloat();
        System.out.println("digite a sua nota no segunda semestre: ");
        nota2 =input.nextFloat();
        System.out.println("sua media foi de: "+(nota1+nota2)/2);
        if ((nota1+nota2)/2==6)
            System.out.println("parabens voce passou na materia");
        else if ((nota1+nota2)/2 >= 2)
            System.out.println("voce precisa fazer o exame de recuperação para passar de ano");
        else 
            System.out.println("voce foi reprovado nessa materia");
        input.close();
    }
}
