/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import model.Administrador;
import model.Carro;
import model.Piloto;
import util.LerArquivo;
import model.Circuito;

/**
 *
 * @author victo
 */
public class Controller {
    String[] config;
    LinkedList<Piloto> pilotos = new LinkedList<>();
    LinkedList<Carro> carros = new LinkedList<>();
    LinkedList<Administrador> administradores = new LinkedList<>(); 
    LinkedList<Circuito> circuitos = new LinkedList<>();
    private boolean conexao = true;
    
    
     //Ler configurações de conexão com o servidor (ip e porta)
    private void lerConfig() throws IOException{
        LerArquivo read = new LerArquivo();
        config = read.lerArquivo();
    }
    
    public void adicionarPiloto(String nome,String equipe, int idade){
        Piloto piloto = new Piloto(nome,equipe,idade);
        pilotos.add(piloto);
    }
    
    public void adicionarCarro(int numero, String cor, String equipe){
        Carro carro = new Carro(numero,cor,equipe);
        carros.add(carro);
    }
    
   
    
    public void adicionarAdministrador (int identificador, String usuario, String senha){
        Administrador administrador = new Administrador(identificador,usuario,senha);
        administradores.add(administrador);
    }
    
    public void adicionarCircuito(String nome, int voltas){
        
        Circuito circ = new Circuito(nome, voltas);
        circuitos.add(circ);
        
    }
    
    public void adicionarVoltaRapida(Circuito circ, int voltR){
        
        circ.setVoltMaisRapida(voltR);
        
    }
    
    public Iterator listarPilotos(){
        
        Iterator itr = pilotos.iterator();
        
        return itr;
    }
    
    public Piloto buscarPorIndice(int x){
        
        Piloto p = pilotos.get(1);
        
        return p;
    }
}
