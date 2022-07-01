
package modulo4parte2;

import modulo4parte2.equipos.OlimpiaCD;
import modulo4parte2.equipos.SevillaFc;
import modulo4parte2.equipos.UrawaRD;



public class Modulo4 {

    
    public static void main(String[] args) {
        
   SevillaFc sevilla = new SevillaFc();
   OlimpiaCD olimpia = new OlimpiaCD();
   UrawaRD urawa = new UrawaRD();
   
   System.out.println("Club: " + sevilla.getEquipo());   
   System.out.println("Presidente: " + sevilla.getCapitan());
   System.out.println("CLub: " + olimpia.getEquipo());
   System.out.println("Presidente: "+ olimpia.getCapitan());
   System.out.println("Club: " + urawa.getEquipo());
   System.out.println("Presidente: " + urawa.getCapitan());
    }
    
}
