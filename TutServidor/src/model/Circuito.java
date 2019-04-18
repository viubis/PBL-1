/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author Daniel
 */
public class Circuito {
    
    private String nomeCircuito;
    private int voltas ;
    private int voltMaisRapida;
    private LinkedList<Carro> listaCarros;
    
    public Circuito( String nome ,int volt, int vMR, LinkedList<Carro> lisC ){
            nomeCircuito = nome;
            voltas = volt;
            nomeCircuito = nome;
            listaCarros = lisC;
        
        
    }

    public String getNomeCircuito() {
        return nomeCircuito;
    }

    public int getVoltas() {
        return voltas;
    }

    public int getVoltMaisRapida() {
        return voltMaisRapida;
    }

    public LinkedList<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setNomeCircuito(String nomeCircuito) {
        this.nomeCircuito = nomeCircuito;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }

    public void setVoltMaisRapida(int voltMaisRapida) {
        this.voltMaisRapida = voltMaisRapida;
    }

    public void setListaCarros(LinkedList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    @Override
    public String toString() {
        return "Circuito{" + "nomeCircuito=" + nomeCircuito + ", voltas=" + voltas + ", voltMaisRapida=" + voltMaisRapida + ", listaCarros=" + listaCarros + '}';
    }
    
    
}
