/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios02.converter_string_em_int;

/**
 *
 * @author Frederico
 */
import java.util.Scanner;

public class converter_string_em_int {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String valorString = scanner.nextLine();

        try {
            int valorInt = Integer.parseInt(valorString);
            System.out.printf("Int: %d\n", valorInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter a String para int. Certifique-se de fornecer um valor válido.");
        }

        scanner.close();
    }
}
