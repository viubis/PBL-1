package util;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Piloto;

//Classe responsável por enviar os dados gerados quando não foi possível se conectar com o servidor.
//Recebe uma lista com cada dados e envia-os a cada 10 segundos.
public class ThreadEnvioPiloto extends Thread{
   private String[] config;
   LinkedList<Piloto> lista;
   private Socket lixeira;

    public ThreadEnvioPiloto(String[] config, LinkedList<Piloto> lista) {
        this.config = config;
        this.lista = lista;
    }
    
    public void run(){
        try {
            enviarLista();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadEnvioPiloto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void enviarLista() throws InterruptedException{
        try {
            Iterator itr = lista.iterator();
            while (itr.hasNext()) {
                Thread.sleep(10000);
                Piloto piloto = (Piloto) itr.next();
                
                //Se conecta com o servidor e envia os dados.
                lixeira = new Socket(config[0],Integer.parseInt(config[1]));
                ObjectOutputStream sendDados = new ObjectOutputStream(lixeira.getOutputStream());
                sendDados.flush();
                sendDados.writeObject(piloto);
                sendDados.reset();
                lixeira.close();
            }
            lista.clear(); //Limpa a lista após enviar todos os dados.  
        } catch (IOException ex) {
            return;
        }
    }
}