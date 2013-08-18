/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_3.aula;

import Clase_3.aula.usoInterface.Capitalizable;
import Clase_3.aula.usoInterface.Oraciones;
import Clase_3.aula.usoInterface.Palabra;

/**
 *
 * @author PCC-DOMINGO
 */
public class UsoInterface {
    
    public static void main(String[] args) {
        
        Capitalizable[] listado = new Capitalizable[3];   

        listado[0] = new Palabra("Programacion en Java");
        listado[1] = new Palabra("Tecsup");
        listado[2] = new Oraciones("Curso Java Basico - Tecsup");        

        /*for (int i=0; i<obj1.length;i++){
	        System.out.println( "Texto " + i + ": " + obj1[i].cambiaMayuscula());
	}*/
        
        for (Capitalizable item : listado) {
            System.out.println(item.cambiaMayuscula());
            
        }

    }
    
    
    
}
