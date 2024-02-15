/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios01.obter_valor_produto;

/**
 *
 * @author Frederico
 */
import java.util.Scanner;

public class obter_valor_produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto (xx.xx): ");
        double valorProduto = scanner.nextDouble();
        scanner.close();

        int valorInteiro = (int) valorProduto;
        System.out.printf("Valor com casas decimais: %.2f | Valor inteiro: %d\n", valorProduto, valorInteiro);

        int valorInt = 10;
        double novoDouble = valorInt;
        System.out.printf("Novo: %d | Convertido: %.2f\n", valorInt, novoDouble);

        double valorDouble = 10.0;
        int convertidoInt = (int) valorDouble;
        System.out.printf("Convertido: %d\n", convertidoInt);
    }
}
