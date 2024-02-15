/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios02.penultima_palavra;

/**
 *
 * @author Frederico
 */
import java.util.Scanner;

public class penultima_palavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = scanner.nextLine();

        exibirPenultimaPalavra(frase);

        scanner.close();
    }

    private static void exibirPenultimaPalavra(String frase) {
        String[] palavras = frase.split(" ");

        if (palavras.length == 0) {
            System.out.println("Nada foi digitado.");
        } else {
            int indexPenultimaPalavra = palavras.length - 2;

            if (indexPenultimaPalavra >= 0) {
                System.out.println("Penúltima palavra: " + palavras[indexPenultimaPalavra]);

                if (palavras.length > 4) {
                    System.out.println("Texto muito longo");
                }
            } else {
                System.out.println("A frase possui menos de duas palavras.");
            }
        }
    }
}
