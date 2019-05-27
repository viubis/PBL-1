
package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import controller.Controller;
import java.util.Iterator;
import java.util.Scanner;
import model.*;
import util.*;


public class view {
    
   public static void main(String[] args) throws IOException{
      
       Controller cont = new Controller();
       Scanner input = receberInput();
       
       int x = 0;
       boolean senhaAcc ;
       
       do{
           CompararSenha cs = new CompararSenha();
           System.out.println("              ADMIN");
           System.out.print("ID : ");
           String nome = input.next();
           System.out.print("Senha:");
           String senha = input.next();
           senhaAcc = cs.CompararSenha(senha);
           
           if(senhaAcc == false){
               System.out.println("Senha errada");
           }else
               System.out.println("LOGADO");
           
           
               
       }while(senhaAcc == false);
      
       
       do{     
       
       System.out.println("MENU");
       System.out.println("1 - Cadastrar Piloto");
       System.out.println("2 - Cadastrar Carro");
       System.out.println("3 - Cadastrar Corrida");
       System.out.println("4 - Iniciar Corrida");
       System.out.println("5 - Sair");
       System.out.print("OPCAO : ");
        
       
       
       int option = input.nextByte();
       System.out.println("");
       switch(option){
           case 1:
               cadastrarPiloto(cont);
               break;
           case 2:
               cadastrarCarro(cont);
               break;
           case 3:
               cadastrarCircuito(cont);
               break;
           case 4:
               iniciarCorrida(cont);
               break;
           case 5:
               x = 5;
               System.out.println("FIM DO PROGRAMA");
               break;
           default :
               System.out.println("erro");
               break;
       }
       
       }while(x != 4);
       
   }
   
   public static void cadastrarPiloto(Controller cont) throws IOException{
       
      
        Scanner input = receberInput();
      
      
       System.out.print("Digite o nome : ");
       String nomeP = input.next();
       
       System.out.print("Digite a idade : ");
       int idadeP = input.nextInt();
       System.out.print("Digite o nome da equipe : ");
       String equipeP = input.next();
       System.out.println("");
       cont.adicionarPiloto(nomeP, equipeP, idadeP);
       System.out.println("Cadastro Feito com Sucesso");
       
       
       
   }
   
    public static Scanner receberInput(){
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        Scanner in = new Scanner(input);
        return in;
    }
    
    public static void cadastrarCarro(Controller cont){
        
        Scanner input = receberInput();
        System.out.print("Digite o numero do Carro : ");
        int numeroC = input.nextInt();
        System.out.print("Digite a cor do Carro :");
        String corC = input.next();
        System.out.print("Digite o nome da Equipe :");
        String equipeC = input.next();
        cont.adicionarCarro(numeroC, corC, equipeC);
        System.out.println("\nCadastro feito com Sucesso!!!");    
        
        
        
    }
    public static void cadastrarCircuito(Controller cont){
        
        Scanner input = receberInput();
        System.out.print("Digite o nome do Circuito : ");
        String nomeCirc = input.next();
        System.out.println("Digite o numero de voltas do Circuito : ");
        int numeroVoltas = input.nextInt();
        
        cont.adicionarCircuito(nomeCirc, numeroVoltas);
        System.out.println("Cadastro Finalizado");
        
        
    }
    
    public static void iniciarCorrida(Controller cont){
        
        Scanner x = receberInput();
        Piloto p = null;
        do{
        System.out.println("Digite o num do piloto :");
        int y = x.nextInt();
        p = cont.buscarPorIndice(y);
        if( p != null){
            System.out.println(p.toString());
        }else{
            System.out.println("Piloto nao encontrado");
        }
        
        }while(p == null);
        
        /*System.out.println("| Lista PILOTOS |");
        Iterator itrP = cont.listarPilotos();
        while(itrP.hasNext()){
            Piloto pil = (Piloto) itrP.next();
            System.out.println(pil.toString());
        }*/
        
        
    }
}
