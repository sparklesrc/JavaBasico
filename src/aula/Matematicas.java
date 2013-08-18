/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.math.MathContext;

/**
 *
 * @author PCC-DOMINGO
 */
public class Matematicas {
    
    
    public static void main(String[] args) {
        Matematicas.getConstants();
        System.out.println(Matematicas.doOperaciones());
        System.out.println(Matematicas.doTagente());
        System.out.println(Matematicas.doCoseno());
        
    }
    
    public static void getConstants(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        System.out.println(Math.abs(-15.1));    
        System.out.println(Math.ceil(15.2));
    }
    public static double doOperaciones(){
        return Math.sqrt(84);
    }
    public static double doTagente(){
        return Math.tan(11);
    }
    public static double doCoseno(){
        return Math.max(Matematicas.doTagente(),Matematicas.doOperaciones());
    }
    public static void wrappers(){
        Integer entero = new Integer(123);
        entero.decode("hola");
    }
    
    
}
