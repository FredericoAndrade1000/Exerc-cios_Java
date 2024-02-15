/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios01.carros;

/**
 *
 * @author Frederico
 */
public class carros {
    public static void main(String[] args) {
        String[] carros = { "civic", "gol", "palio", "uno" };

        System.out.println("Iteração inicial:");
        for (String carro : carros) {
            System.out.println("Nome carro: " + carro);
        }

        for (int i = 0; i < carros.length; i++) {
            if (carros[i].equals("gol")) {
                carros[i] = "L200";
                break;
            }
        }

        System.out.println("\nIteração após alteração do Gol para L200:");
        for (String carro : carros) {
            System.out.println("Nome carro: " + carro);
        }

        String[] novoArray = new String[carros.length + 1];
        System.arraycopy(carros, 0, novoArray, 0, carros.length);
        novoArray[novoArray.length - 1] = "gol";

        System.out.println("\nIteração após adicionar o Gol na última posição:");
        for (String carro : novoArray) {
            System.out.println("Nome carro: " + carro);
        }
    }
}