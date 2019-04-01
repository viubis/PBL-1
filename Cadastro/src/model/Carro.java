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
public class Carro {
    private int numero;
    private String cor;
    private String equipe;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Carro{" + "numero=" + numero + ", cor=" + cor + ", equipe=" + equipe + '}';
    }

    public Carro(int numero, String cor, String equipe) {
        this.numero = numero;
        this.cor = cor;
        this.equipe = equipe;
    }
    
    
}
