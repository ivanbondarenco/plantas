/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.repasito;

/**
 *
 * @author eivaa
 */
public class Arbol extends Planta {
    private String variedad;
    private String tipoTronco;
    private Color colorArbol;
    private String tipoHoja;
    
    public Arbol(String nombre, int alto, boolean hojas, String clima
    , String variedad, String tipoTronco, Color color, String tipoHoja) {
        super(nombre, alto, hojas, clima);
       this.variedad = variedad;
       this.tipoTronco = tipoTronco;
       this.colorArbol = color;
       this.tipoHoja = tipoHoja;
    }
    
    @Override
       public void mensaje(){
        System.out.println("Hola soy un arbol");
    }
}
