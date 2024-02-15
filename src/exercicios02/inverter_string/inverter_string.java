/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios02.inverter_string;

/**
 *
 * @author Frederico
 */
import java.util.Scanner;

public class inverter_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palavra ou frase: ");
        String texto = scanner.nextLine();

        inverterCaracteresPorLoop(texto);
        inverterString(texto);

        scanner.close();
    }

    private static void inverterCaracteresPorLoop(String texto) {
        System.out.print("Por caractere: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }

    private static void inverterString(String texto) {
        System.out.println("String: " + new StringBuilder(texto).reverse().toString());
    }
}
