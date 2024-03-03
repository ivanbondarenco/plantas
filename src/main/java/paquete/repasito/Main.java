/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.repasito;

/**
 *
 * @author eivaa
 */
public class Main {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol("Jacarandá", 2000, true, "calido",
        "Harabisco Jacaranda acutifolia", "JACAJACA", Color.MARRON,
        "cuadradas" );
        Flor rosa = new Flor("Rosa", 15, true, "cualquiera",
         Color.ROJO, 15.2, Color.VERDE, "tucus", Estacion.INVIERNO);
        Arbusto arbustito = new Arbusto("Locus", 1000, true, "humedo",
               2000, false," truca", Color.BLANCO, true);
       
        arbolito.mensaje();
        rosa.mensaje();
        arbustito.mensaje();
        
    }
       
        
       
    
    }
   

