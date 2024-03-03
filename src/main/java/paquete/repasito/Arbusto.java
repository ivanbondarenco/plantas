/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.repasito;

/**
 *
 * @author eivaa
 */
public class Arbusto extends Planta {
    private int anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private Color colorHojas;
    private boolean sePodaONo;
    
  public Arbusto(String nombre, int alto, boolean hojas, String clima,
            int anchoArbusto, boolean esDomestico, String variedadArbustos,
            Color colorHojas, boolean sePodaONo) {
        super(nombre, alto, hojas, clima);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.colorHojas = colorHojas;
        this.sePodaONo= sePodaONo;
        
    }
  
    @Override
    public void mensaje(){
        System.out.println("Hola soy un arbusto");
    }
}
