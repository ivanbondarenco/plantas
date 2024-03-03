/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.repasito;

/**
 *
 * @author eivaa
 */
public abstract class Planta {
   private String nombre;
   private int alto;
   private boolean tieneHojas;
   private String climaIdeal;
    
    public Planta(String nombre, int alto, boolean hojas,
            String clima){
    
    this.nombre = nombre;
    this.alto = alto;
    this.tieneHojas = hojas;
    this.climaIdeal = clima;
    }
      public abstract void mensaje(); 
    
    
    
}
