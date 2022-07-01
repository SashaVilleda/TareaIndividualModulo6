
package modulo4part1;



public class main {
    public static void main (String [] args){
        
    Futbolista futbolista = new Futbolista ();
    
    futbolista.setNombre("Mauricio Juanlindo");
    futbolista.setEdad(30);
    futbolista.setEquipo("Motagua");
    
    System.out.println("Nombre del jugador: "+ futbolista.getNombre());
    System.out.println("Edad: " + futbolista.getEdad());
    System.out.println("Equipo: "+ futbolista.getEquipo());
    
    
    }
    
}
