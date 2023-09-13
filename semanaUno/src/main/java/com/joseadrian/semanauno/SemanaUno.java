

package com.joseadrian.semanauno;


public class SemanaUno {

    public static void main(String[] args) { 
    
    met_Persona persona = new met_Persona();
    //met_entero();
    //met_mostrar();
    persona.hablar();    
        
        
    }
    
    
    public static void met_mostrar() {

        System.out.println("Bienvenido "+met_entero());
    }
    
    public static int met_entero() {
    int var_num= 18;
        
    return var_num; 
}
}
