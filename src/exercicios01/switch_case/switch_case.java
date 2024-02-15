/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios01.switch_case;

/**
 *
 * @author Frederico
 */
public class switch_case {
    public static void main(String[] args) {
        for (int valor = 0; valor <= 5; valor++) {
            switch (valor) {
                case 1:
                    System.out.println("Primeira condição");
                    break;
                case 4:
                    System.out.println("Segunda condição");
                    break;
                default:
                    System.out.println("Não encontrou uma condição");
            }
        }
    }
}
