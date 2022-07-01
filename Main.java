//Sasha Stephany villeda Banegas
//201810040089
package modulo_3;


public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Tarjeta de Presentacion y contacto. ");
        
      
    Abogado abogado = new Abogado();
    
    abogado.setNombre("Luis");
    abogado.setApellido("Perez");
    abogado.setTel ("99345416");
    
    System.out.println("Abogado: "+ abogado.getNombre());
    System.out.println("Despacho de abogados: " + abogado.getApellido());
    System.out.println("Contacto: " + abogado.getTel());
    
    
   
    }
    
}
