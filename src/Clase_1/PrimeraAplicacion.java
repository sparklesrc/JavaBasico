/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_1;

import java.io.BufferedInputStream;
import java.util.Date;

/**
 *
 * @author PFR
 */
public class PrimeraAplicacion {

    public static void main(String[] args) {

        /*
         * Ejercicio 1
         */
        //ejecercicioSwitch();
        ejercicio8(13);
        
    }

    public static void ejercicio6() {



        boolean comp_x = (3 * 4 >= 12) && (3.5 > 1 + 2f) || (4 < 8);

        boolean comp_y = !(true == false);

        boolean comp_z = (!true == false);

        System.out.println(comp_x + "\n" + comp_y + "\n" + comp_z);

        //( (3*4 > =12) && (3.5> 1+2f)) || (4<8);


    }

    public static void ejecercicioSwitch() {

        int diaSemana = 1;
        String textoSemana = "";

        switch (diaSemana) {
            case 1:
                textoSemana = "Domingo";
                break;
            case 2:
                textoSemana = "Lunes";
                break;
            default:
                textoSemana = "Dia Invalido";
                break;
        }

        System.out.println(textoSemana);
    }

    /*public static void ejercicioWhile() {
        

        
        
        inicio: //especificar un point punto
        ;

        int contador = 1;
        while (contador <= 10) {
            System.out.println("Contador " + contador);
            ++contador;
        }

        System.out.println("ROMPIO BUCLE 1");

        do {
            System.out.println("Contador " + contador);
            ++contador;

            if (contador == 14) {
                break inicio;
            }

        } while (contador <= 15);

    }*/
    public static void ejercicioFor(){
        
        for (int i = 0; i < 10; i++) {
            if(i==6){
                break;
            }
            System.out.println(i);
            
        }
    }
    
    
    public static void ejercicio7(int edad){
        double precio=100, porcentaje;
        double total;
        
        if(edad<=18){
            total=precio*0.85;
            porcentaje=0.15;
            
            System.out.println("Descuento "+porcentaje+"\nEl total a pagar "+total);
            
        }else if(edad>60){
            total=precio*0.7;
            porcentaje=0.3;
            System.out.println("Descuento "+porcentaje+"\nEl total a pagar "+total);
        }
        else{
            total=precio;
            porcentaje=0;
            System.out.println("Descuento "+porcentaje+"\nEl total a pagar "+total);
        }
        
    }
    
    
    public static void ejercicioMatriz(){
        
        int [] numeros = new int[5];
        
        numeros[0]=15;
        numeros[1]=8888;
        numeros[2]=17;
        numeros[3]=9;
        numeros[4]=222222;
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Registro "+i+" es "+numeros[i]);
        }
    }
    
    public static void ejercicio8(int mes){
        
        int meses[] ={30,28,31,30,31,30,31,30,31,30,30,31};
        
        if(mes <= meses.length){
        System.out.println(meses[mes-1]);
        }else{
            System.out.println("Ingresar otro mes");
        }
    }
}