/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Daniel
 */
public class CompararSenha{
    
    private String senha1 = "12345" ;
    
    public CompararSenha(){
        
    }
    
    public boolean CompararSenha(String senha){
        if(senha == this.senha1){
            return true;
        }else
            return false;
        
    }
    
}
