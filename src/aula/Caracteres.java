/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author PCC-DOMINGO
 */
public class Caracteres {
    
    public static void main(String[] args) {
        Caracteres.doConcatenar();
        Caracteres.doSubString();
        Caracteres.doReplace();
        Caracteres.useStringBuffer();
        Caracteres.useStringBuffer();
    }
    
    
    public static void doConcatenar(){
        String nombre="Franchesco";
        String apellido="Ramirez";
        
        System.out.println(nombre+" "+apellido);
        System.out.println(nombre.concat(apellido));
    }
    public static void doSubString(){
        String cadenaLarga = "Es mi cadena Larga";
        
        System.out.println(cadenaLarga.substring(3));
        System.out.println(cadenaLarga.substring(3,8));
    }
    public static void doReplace(){
       String cadenaReemplazo = "Aqui se debe reemplazar esto por otra cosa"; 
        System.out.println(cadenaReemplazo.replace("esto", "perritossssss"));
        
    }
    
    public static void useStringBuffer(){
        StringBuffer sb = new StringBuffer("Cadena de Texto");
        
        System.out.println("Cadena de Texto");
        
        sb.insert( 1, "perr");
        sb.delete(2, sb.length());
        
        System.out.println(sb);
        
        System.out.println(sb.indexOf("de"));
        
    }
}
