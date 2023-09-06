import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        float valorProduto = 0;
        byte codigoPais = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("digite o valor do produto: ");
        valorProduto = input.nextFloat();
        System.out.println("codigo pais de origem: \n1-Estados unidos \n2-frança \n3-mexico \n4-argentina \n5-china: ");
        codigoPais = input.nextByte();
        switch (codigoPais) {
            case 1:
                System.out.println("O valor total do produto sera: " + (valorProduto + 60.00f));
                break;
            case 2:
                System.out.println("O valor total do produto sera: " + (valorProduto + 75.50f));
                break;
            case 3:
                System.out.println("O valor total do produto sera: " + (valorProduto + 50.00f));
                break;
            case 4:
                System.out.println("O valor total do produto sera: " + (valorProduto + 27.35f));
                break;
            case 5:
                System.out.println("O valor total do produto sera: " + (valorProduto + 80.00f));
                break;
            default:
                System.out.println("codigo de pais invalido");
                break;
        }
        input.close();
    }
}

/*
 * Uma importadora importa produtos de vários países. O preço do frete varia de
 * acordo com o
 * país seguindo a tabela abaixo. Faça um programa que receba o valor de um
 * produto, o país
 * de origem (imprima as opções possíveis em um menu) e imprima o valor total do
 * produto
 * mais frete.
 * Estados unidos 60,00
 * frana 75,50
 * mexico 50,00
 * argentina 27,35
 * china 80,00
 * 
 */