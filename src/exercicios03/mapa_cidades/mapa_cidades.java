/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03.mapa_cidades;

/**
 *
 * @author Frederico
 */
import java.util.HashMap;
import java.util.Map;

public class mapa_cidades {
    public static void main(String[] args) {
        Map<String, String> mapaItens = new HashMap<>();

        mapaItens.put("SRS", "Santa Rita do Sapucai");
        mapaItens.put("PA", "Pouso Alegre");
        mapaItens.put("ITA", "Itajubá");
        mapaItens.put("ZORO", "Conceição dos Ouros");
        mapaItens.put("CAXU", "Cachoeira de Minas");

        try {
            System.out.println("Iteração do mapa:");
            for (Map.Entry<String, String> entry : mapaItens.entrySet()) {
                System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
            }

            System.out.println();

            System.out.println("Valor da chave 'ZORO': " + mapaItens.get("ZORO"));

            System.out.println("Valor da chave 'MG': " + mapaItens.get("MG"));

        } finally {
            System.out.println();
        }

        mapaItens.put("SRS", "Santa Rita");

        System.out.println("Iteração do mapa após a alteração:");
        for (Map.Entry<String, String> entry : mapaItens.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
