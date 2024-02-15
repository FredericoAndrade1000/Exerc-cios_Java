/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03.lista_itens;

/**
 *
 * @author Frederico
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista_itens {
    public static void main(String[] args) {
        List<String> listaItens = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String dado = obterDados();

            while (dado.equals("INVALIDO")) {
                System.out.println("Valor inválido. Tente novamente.");
                dado = obterDados();
            }

            listaItens.add(dado);
        }

        System.out.println("Itens da lista:");
        for (String item : listaItens) {
            System.out.println(item);
        }

        listaItens.add("item adicionado automaticamente 01");
        listaItens.add("item adicionado automaticamente 02");

        if (listaItens.size() >= 2) {
            listaItens.remove(1);
        }

        try {
            listaItens.remove(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Não foi possível remover o segundo item novamente. Índice inválido.");
        }

        System.out.println("\nLista após remoções:");
        for (String item : listaItens) {
            System.out.println(item);
        }
    }

    private static String obterDados() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um item: ");
            return scanner.nextLine();
        } catch (Exception e) {
            return "INVALIDO" + e;
        } finally {
            scanner.close();
        }
    }
}
