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
public class Carta{
    private String personaje;
    private int id;

    public Carta(String personaje, int id){
        this.personaje=personaje;
        this.id=id;
    }
    
    public String getPersonaje(){
        return personaje;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        String datos="";
        return datos+"id"+id+"personaje"+personaje;
    }
}