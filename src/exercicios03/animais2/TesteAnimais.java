/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03.animais2;

/**
 *
 * @author Frederico
 */
import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        // Ganhar 2 instâncias de Cachorro
        Cachorro cachorro1 = new Cachorro("Rex");
        Cachorro cachorro2 = new Cachorro("Bella");
        cachorro1.setCor("azul");

        animais.add(cachorro1);
        animais.add(cachorro2);

        // Ganhar 2 instâncias de Gato
        Gato gato1 = new Gato();
        Gato gato2 = new Gato("cinza");

        animais.add(gato1);
        animais.add(gato2);

        // Iterar a lista de animais
        for (Animal animal : animais) {
            animal.interagir();
        }
    }
}
