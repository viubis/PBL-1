package controller;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import model.Administrador;
import model.Carro;
import model.Circuito;
import model.Piloto;

public class ServerController {

    
        LinkedList<Piloto> pilotos = new LinkedList<>();
        LinkedList<Carro> carros = new LinkedList<>();
        LinkedList<Administrador> administradores = new LinkedList<>(); 
        LinkedList<Circuito> circuitos = new LinkedList<>();
	private static ServerController controller;
		
	public static ServerController getInstance() {
		if(controller == null){
			controller = new ServerController();
		}
		return controller;
	}
	
        public void cadastroCarro(int num, String cor, String equipe){
            Carro carro = new Carro(num,cor,equipe);
            carros.add(carro);
        }
        
          public void cadastroCircuito(){
            Circuito circuito = new Circuito("nome", 20, 15, carros);
            circuitos.add(circuito);
        }
        
	public void informarVolta(Socket client) {
            
                cadastroCarro(1,"azul", "williams");
                cadastroCarro(2,"azul", "williams");
		System.out.println("Um cliente quer que eu informe a volta");
                Carro carro = carros.getFirst();
		this.enviarResposta(client, new Date().toString() +"Carro:" + carro.getNumero() );
	}
        
        public void informarCircuito(Socket client) {
            
                cadastroCircuito();
		System.out.println("Um cliente quer que eu informe o circuito");
                Circuito circuito = circuitos.getFirst();
		this.enviarResposta(client, circuito.toString() );
	}
	
	private void enviarResposta (Socket client, String resposta) {
		try {
                    DataOutputStream saida = new DataOutputStream(client.getOutputStream());
                    saida.write(resposta.getBytes());
                    saida.flush();
                    client.close();
		} catch (IOException e) {
                    e.printStackTrace();
		} 
	}
}