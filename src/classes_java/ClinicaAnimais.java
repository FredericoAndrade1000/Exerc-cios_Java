package classes_java;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClinicaAnimais {
    private List<Cavalo> cavalos = new ArrayList<>();
    private List<Girafa> girafas = new ArrayList<>();
    private Map<Integer, Animal> animais = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private int nextAnimalId = 1;

    public static void main(String[] args) {
        ClinicaAnimais clinica = new ClinicaAnimais();
        clinica.executarMenu();
    }

    private void executarMenu() {
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar cavalo");
            System.out.println("2. Cadastrar girafa");
            System.out.println("3. Listar cavalos");
            System.out.println("4. Listar girafas");
            System.out.println("5. Listar todos os animais");
            System.out.println("6. Remover um animal por id");
            System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarCavalo();
                    break;
                case 2:
                    cadastrarGirafa();
                    break;
                case 3:
                    listarCavalos();
                    break;
                case 4:
                    listarGirafas();
                    break;
                case 5:
                    listarTodosOsAnimais();
                    break;
                case 6:
                    removerAnimalPorId();
                    break;
                case 7:
                    exibirQuantidadePorTipo();
                    break;
                case 8:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 8);
    }

    private void cadastrarCavalo() {
        System.out.print("Digite o nome do cavalo: ");
        String nome = scanner.nextLine();
        Cavalo cavalo = new Cavalo(nextAnimalId++, nome);
        cavalos.add(cavalo);
        animais.put(cavalo.getId(), cavalo);
        System.out.println("O cavalo foi inserido com sucesso.");
    }

    private void cadastrarGirafa() {
        System.out.print("Digite o nome da girafa: ");
        String nome = scanner.nextLine();
        Girafa girafa = new Girafa(nextAnimalId++, nome);
        girafas.add(girafa);
        animais.put(girafa.getId(), girafa);
        System.out.println("A girafa foi inserida com sucesso.");
    }

    private void listarCavalos() {
        for (Cavalo cavalo : cavalos) {
            System.out.println("Dados do cavalo: " + cavalo.getId() + " | " + cavalo.getNome());
        }
    }

    private void listarGirafas() {
        for (Girafa girafa : girafas) {
            System.out.println("Dados da girafa: " + girafa.getId() + " | " + girafa.getNome());
        }
    }

    private void listarTodosOsAnimais() {
        for (Animal animal : animais.values()) {
            String tipo = (animal instanceof Cavalo) ? "Cavalo" : "Girafa";
            System.out.println("Dados do animal: " + tipo + " | " + animal.getId() + " | " + animal.getNome());
        }
    }

    private void removerAnimalPorId() {
        System.out.print("Digite o ID do animal que deseja remover: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Animal animal = animais.get(id);
        if (animal != null) {
            if (animal instanceof Cavalo) {
                cavalos.remove(animal);
            } else if (animal instanceof Girafa) {
                girafas.remove(animal);
            }
            animais.remove(id);
            System.out.println("Animal removido com sucesso.");
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    private void exibirQuantidadePorTipo() {
        System.out.println("Número de cavalos cadastrados: " + cavalos.size());
        for (Cavalo cavalo : cavalos) {
            System.out.println("Dados do cavalo: " + cavalo.getId() + " | " + cavalo.getNome());
        }

        System.out.println("Número de girafas cadastradas: " + girafas.size());
        for (Girafa girafa : girafas) {
            System.out.println("Dados da girafa: " + girafa.getId() + " | " + girafa.getNome());
        }

        System.out.println("Total de animais cadastrados: " + animais.size());
    }
}