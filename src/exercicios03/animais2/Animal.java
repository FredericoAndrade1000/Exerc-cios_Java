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

public abstract class Animal {
    private String cor = "preto";
    private int idade = 5;
    private String nome = "não definido";

    public abstract void som();

    public void dizerMeuNome() {
        System.out.println("Nome do animal: " + nome);
    }

    private void dizerMinhaIdade() {
        System.out.println("Minha idade é: " + idade);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void interagir() {
        som();
        dizerMeuNome();

        if (this instanceof Cachorro) {
            ((Cachorro) this).oQueGostoDeFazer();
        } else if (this instanceof Gato) {
            ((Gato) this).oQueFacoDuranteANoite();
        }

        System.out.println("Cor do animal: " + getCor());
        System.out.println("------");
    }
}
