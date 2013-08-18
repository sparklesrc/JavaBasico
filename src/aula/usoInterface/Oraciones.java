/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.usoInterface;

/**
 *
 * @author PCC-DOMINGO
 */
public class Oraciones implements Capitalizable{

    private String texto;
    
    public Oraciones(String texto){
        this.texto=texto;
    }
    
    
    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
    
    public String agregarPalabra(String t){
        texto = texto.concat(" "+t);
        return texto;
    }
    
    
    
}
