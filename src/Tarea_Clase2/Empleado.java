/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_Clase2;

import java.util.Date;

/**
 *
 * @author SparKLes
 */
public class Empleado {
    
    private String dniEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int edadEmpleado;
    private String fechaIngreso;
    
    
    
    Empresa objEmp = new Empresa();
    CargoLaboral objCL = new CargoLaboral();
    Pais objP= new Pais();
    
    
    
    public String registrarEmpleado(String dniEmpleado, String nombreEmpleado, 
            String apellidoEmpleado, int edadEmpleado, String fechaIngreso ){
        
       this.dniEmpleado=dniEmpleado;
       this.nombreEmpleado=nombreEmpleado;
       this.apellidoEmpleado=apellidoEmpleado;
       this.edadEmpleado=edadEmpleado;
       this.fechaIngreso=fechaIngreso;
       
     return "El Codigo del nuevo empleado es: "+dniEmpleado+", Su nombre es "+fechaIngreso ;
    }
    
    public String agregarCargo(){
        objCL.setNombreCargo("Administrador");
        objCL.setSueldoCargo(2500.00); 
        
        return "Cargo Agregado";
    }
        
}