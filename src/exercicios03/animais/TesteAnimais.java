/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03.animais;

/**
 *
 * @author Frederico
 */
import exercicios03.animais2.Animal;
import exercicios03.animais2.Gato;
import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro("Rex");
        Cachorro cachorro2 = new Cachorro("Bella");

        cachorro1.setCor("azul");

        animais.add(cachorro1);
        animais.add(cachorro2);

        for (Animal animal : animais) {
            animal.som();
            animal.dizerMeuNome();

            if (animal instanceof Cachorro) {
                ((Cachorro) animal).oQueGostoDeFazer();
            }

            System.out.println("Cor do animal: " + animal.getCor());
            System.out.println("------");
        }

        Gato gato1 = new Gato();
        Gato gato2 = new Gato("cinza");

        animais.add(gato1);
        animais.add(gato2);

        for (Animal animal : animais) {
            animal.som();
            animal.dizerMeuNome();

            if (animal instanceof Gato) {
                ((Gato) animal).oQueFacoDuranteANoite();
            }

            System.out.println("Cor do animal: " + animal.getCor());
            System.out.println("------");
        }
    }
}
