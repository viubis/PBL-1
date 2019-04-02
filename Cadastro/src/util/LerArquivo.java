package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    
    //Função responsável por ler o arquivo (config.txt) de texto que contém o ip e a porta do servidor.
    //Sendo a primeira linha do arquivo o ip e a segunda linha a porta.
    public String[] lerArquivo() throws FileNotFoundException, IOException{
        BufferedReader read = new BufferedReader(new FileReader("config.txt"));
        
        String l;
        String[] config = new String[2];
        
        System.out.println("teste");
        
        for (int i = 0; i < 2; i++) {
            l = read.readLine();
            config[i] = l;
        }
        return config;
    }
}