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
public class Gato extends Animal {
    public Gato() {
    }

    public Gato(String cor) {
        setCor(cor);
    }

    @Override
    public void som() {
        System.out.println("Eu gosto de miar");
    }

    public void oQueFacoDuranteANoite() {
        System.out.println("Gosto de pular a cerca toda noite");
    }
}
