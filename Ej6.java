/*Crear un programa que imprima en consola un 
nombre de estudiante, una nota y una etiqueta que diga Aprobado o Reprobado,
dependiendo del valor de la nota que tenga*/
//Sasha Stephany Villeda Banegas 201810040089

package modulo1;

public class Ej6 {

    public static void main(String[] args) {
      
        int nota1 = 68;
        int nota2 = 80;
        
     System.out.println("Juan " + nota1 + ": ");   
    if(nota1 > 70){   
    System.out.print(" Aprovado "); 
    }
    else{
    System.out.print(" Reprobado");
    }
    
    System.out.println(" ");   
    System.out.println(" ");
    
    System.out.println("Sofia " + nota2+ ": ");   
    if(nota2 > 70){   
    System.out.print(" Aprovado "); 
    }
    else{
    System.out.print(" Reprobado ");
    }         
    
  }
   
}
