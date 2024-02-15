/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios01.metodos;

/**
 *
 * @author Frederico
 */
public class metodos {
    public static void main(String[] args) {
        int[] inteiros = { 5, 5 };
        double[] doubles = { 10.27, 10.42 };
        String[] strings = { "44", "um texto qualquer" };

        realizarOperacao(inteiros);
        realizarOperacao(doubles);
        realizarOperacao(strings);
    }

    private static void realizarOperacao(int[] numeros) {
        int resultado = numeros[0] + numeros[1];
        System.out.println("Resultado da operação: " + resultado);
    }

    private static void realizarOperacao(double[] numeros) {
        double resultado = numeros[0] - numeros[1];
        System.out.println("Resultado da operação: " + resultado);
    }

    private static void realizarOperacao(String[] textos) {
        String resultado = textos[0] + " " + textos[1];
        System.out.println("Resultado da operação: " + resultado);
    }
}
