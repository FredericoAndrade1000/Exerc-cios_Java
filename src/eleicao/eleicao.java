/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

/**
 *
 * @author Frederico
 */
import java.util.*;

public class eleicao {

    public static void main(String[] args) {
        List<candidato> candidatos = Arrays.asList(
                new candidato(1, "Joao"),
                new candidato(2, "Maria"),
                new candidato(3, "Jose"),
                new candidato(4, "Antonio"),
                new candidato(5, "Tiburssinho")
        );

        Map<candidato, Integer> votos = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu voto (0 para encerrar): ");
            int voto = scanner.nextInt();

            if (voto == 0) {
                break;
            }

            candidato candidato = getCandidatoById(candidatos, voto);

            if (candidato != null) {
                votos.put(candidato, votos.getOrDefault(candidato, 0) + 1);
                System.out.println("Obrigado, seu voto foi registrado!");
            } else {
                System.out.println("Candidato inválido. Tente novamente.");
            }
        }

        scanner.close();

        exibirResultadoEleicao(votos);
    }

    private static candidato getCandidatoById(List<candidato> candidatos, int id) {
        for (candidato candidato : candidatos) {
            if (candidato.getId() == id) {
                return candidato;
            }
        }
        return null;
    }

    private static void exibirResultadoEleicao(Map<candidato, Integer> votos) {
        System.out.println("Resultado da Eleição:");

        List<Map.Entry<candidato, Integer>> listaOrdenada = new ArrayList<>(votos.entrySet());
        listaOrdenada.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("O candidato eleito é o " + listaOrdenada.get(0).getKey().getNome() + ".");
        
        System.out.println("Classificação:");

        for (int i = 0; i < listaOrdenada.size(); i++) {
            candidato candidato = listaOrdenada.get(i).getKey();
            int numVotos = listaOrdenada.get(i).getValue();
            System.out.println("Lugar " + (i + 1) + ": " + candidato.getNome() + " - " + numVotos + " votos");
        }
    }
}