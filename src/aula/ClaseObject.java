/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Date;

/**
 *
 * @author PCC-DOMINGO
 */
public class ClaseObject {
    
    public static void main(String [] args){
        
        ClaseObject.doEquals();
        ClaseObject.doToString();
        ClaseObject obj =  new ClaseObject();
        obj.toString();
        ClaseObject.rareCompare();
       
    }
    
    
    public static void doEquals(){
        
        Date fechaNacimiento = new Date();
        //Date fechaCumpleaños = fechaNacimiento;
        Date fechaCumpleaños = new Date();
        
        
        if(fechaNacimiento == fechaCumpleaños){
            System.out.println("Iguales");
        }
        
        if(fechaNacimiento.equals(fechaCumpleaños)){
            System.out.println("Iguales");
        }
        
        
        
    }
    
    public static void doToString(){
        
        Date fechaNacimiento = new Date();
        //System.out.println(fechaNacimiento.toString());
        
        
        ClaseObject x = new ClaseObject();
        System.out.println(x.toString());

    }
    
    @Override
    public String toString(){
        return "Explicando la sobre escritura";
    }
    
    public static void rareCompare(){
        
        //Declarar con clases Wrapper
        Integer numeroA = 12;
        Integer numeroB = 12;
        
        //Declarar con objetos
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);
        
        if(numeroA==numeroB){
            System.out.println("Iguales A y B");
        }
        if(numeroX== numeroY){
            System.out.println("Iguales X e Y");
           
        }
        
        //Al convertir uno de los valores con intValue, java ya puede comparar
        if(numeroX.intValue()==numeroY){
            System.out.println("Iguales by intValue");
        }
        
    }
    
}
