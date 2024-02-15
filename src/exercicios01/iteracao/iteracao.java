/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios01.iteracao;

/**
 *
 * @author Frederico
 */
public class iteracao {
    public static void main(String[] args) {
        exibirIteracaoWhile();
        exibirIteracaoDoWhile();
        exibirIteracaoFor();
    }
    
    private static void exibirIteracaoWhile() {
        int i = 0;

        while (i < 20) {
            System.out.println("Valor i: " + i);
            i++;
        }
    }

    private static void exibirIteracaoDoWhile() {
        int k = 0;

        do {
            System.out.println("Valor k: " + k);
            k++;
        } while (k < 20);
    }

    private static void exibirIteracaoFor() {
        for (int j = 0; j < 20; j++) {
            System.out.println("Valor j: " + j);
        }
    }
}


