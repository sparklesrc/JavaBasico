/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.usoInterface;

/**
 *
 * @author PCC-DOMINGO
 */
public class Palabra implements Capitalizable{
    
    String texto;
    
    public Palabra(String n){
        texto = n.replaceAll(" ", "");
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
    
    
    
}
