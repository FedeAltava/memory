/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author Usuario
 */
public class jugadores{
    private String nombre;
    private int contrasenya;
 
    public jugadores(String nombre,int contrasenya){
        this.nombre = nombre;
     
    }
    
    public String getPersonaje(){
        return nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String toString(){
        String datos="";
        return datos+"nombre: "+nombre;
    }
}