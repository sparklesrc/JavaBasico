/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_3.libreria;

import Clase_3.aula.Formato;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author PCC-DOMINGO
 */
public class Utiles {
    
    public static Date stringToDate(String fecha) {
        
        DateFormat dateformat = DateFormat.getDateInstance();
        
        Date date= null;
        
        try {
            date=dateformat.parse(fecha);
        } catch (Exception e) {
            System.out.println("ERROR EN FORMATO DE FECHA INGRSADO");
        }
        
        
        return date;
        
    }
    
}
