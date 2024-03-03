/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.repasito;

/**
 *
 * @author eivaa
 */
public class Flor extends Planta {
    private Color colorPetalos;
    private double cantidadPromedio;
    private Color colorPistilo;
    private String variedadFlor;
    private Estacion estacion;
    
    
    public Flor(String nombre, int alto, boolean hojas, String clima,
            Color colorPetalos, double cantidadPromedio, Color colorPistilo,
            String variedadFlor, Estacion estacion) {
        super(nombre, alto, hojas, clima);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedio = cantidadPromedio;
        this.colorPistilo = colorPistilo;
        this.variedadFlor= variedadFlor;
        this.estacion = estacion;
        
    }
    @Override
       public void mensaje(){
        System.out.println("Hola soy una Flor");
    }
    
}
