import java.util.Scanner;

public class ex4 {
    public static void main(String []args){
        byte codigo = 0, quantidade = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("digite o codigo do produto \ncachorro quente   100   1.20\nbauru simples     101   1.30\nbauru com ovo     102   1.50\nhamburguer        103   1.20\ncheeseburguer     104   1.30\nrefrigerante      105   1.00");
        codigo = input.nextByte();
        System.out.println("digite a quantidade: ");
        quantidade = input.nextByte();
        switch (codigo) {
            case 100:
                System.out.println("valor total: "+(quantidade*1.20));
                break;
            case 101:
                System.out.println("valor total: "+(quantidade*1.30));
                break;
            case 102:
                System.out.println("valor total: "+(quantidade*1.50));
                break;
            case 103:
                System.out.println("valor total: "+(quantidade*1.20));
                break;
            case 104:
                System.out.println("valor total: "+(quantidade*1.30));
                break;
            case 105:
                System.out.println("valor total: "+(quantidade*1.00));
                break;
            default:
                System.out.println("codigo de produto invalido");
                break;
        }
        input.close();
    }
}
/*O cardápio de uma lanchonete é o seguinte:

cachorro quente   100   1.20
bauru simples     101   1.30
bauru com ovo     102   1.50
hambúrguer        103   1.20
cheeseburguer     104   1.30
refrigerante      105   1.00

Implemente um programa que leia o código do item pedido, a quantidade e calcule o valor a
ser pago por aquele lanche. Considere que a cada execução somente será calculado um
item.
 */