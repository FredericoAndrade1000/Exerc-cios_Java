/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios02.media_valores;

/**
 *
 * @author Frederico
 */
import java.util.Scanner;

public class media_valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calcularEMostrarMedia(scanner);

        scanner.close();
    }

    private static void calcularEMostrarMedia(Scanner scanner) {
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Valor #" + (contador + 1) + ": ");
            double valor = scanner.nextDouble();

            if (valor == -1) {
                break;
            }

            soma += valor;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum valor fornecido.");
        }
    }
}
