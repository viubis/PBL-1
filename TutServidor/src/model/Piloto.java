/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author victo
 */
public class Piloto {
    private String nome;
    private String equipe;
    private int idade;

    public Piloto(String nome, String equipe, int idade) {
        this.nome = nome;
        this.equipe = equipe;
        this.idade = idade;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nome=" + nome + ", equipe=" + equipe + ", idade=" + idade + '}';
    }
    
    
}
