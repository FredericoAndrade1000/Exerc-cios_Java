/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios02.menor_maior_valor;

/**
 *
 * @author Frederico
 */
import java.util.Scanner;

public class menor_maior_valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = obterValores(scanner);
        calcularEMostrarResultados(valores);

        scanner.close();
    }

    private static int[] obterValores(Scanner scanner) {
        int[] valores = new int[4];

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o valor " + i + ": ");
            valores[i - 1] = scanner.nextInt();
        }

        return valores;
    }

    private static void calcularEMostrarResultados(int[] valores) {
        int menor = valores[0];
        int maior = valores[0];

        for (int valor : valores) {
            menor = Math.min(menor, valor);
            maior = Math.max(maior, valor);
        }

        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);

        if (maior > 50) {
            System.out.println("Valor muito alto");
        } else {
            System.out.println("Valor normal");
        }
    }
}
