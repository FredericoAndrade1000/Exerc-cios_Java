/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03.animais;

import exercicios03.animais2.Animal;

/**
 *
 * @author Frederico
 */
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        setNome(nome);
    }

    @Override
    public void som() {
        System.out.println("Eu gosto de latir");
    }

    public void oQueGostoDeFazer() {
        System.out.println("Gosto de morder os carteiros");
    }
}
