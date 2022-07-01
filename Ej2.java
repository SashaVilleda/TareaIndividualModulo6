/*Crear un programa que imprima en consola
todas las operaciones aritméticas de dos 
números enteros (suma, resta, multiplicación, divición, mod)
*/
//Sasha Stephany Villeda Banegas 201810040089
package modulo1;


public class Ej2 {

    public static void main(String[] args) {
         
    double suma;
    double resta;
    double multi;
    double div = 0;
    
                
    double n1 = 15;
    double n2 = 10;
        
        suma = n1 + n2;
        resta = n1 - n2;
        multi = n1 * n2;
        
        if(n2 != 0){
            div = n1 / n2;
        }
 
        
       System.out.println("La suma es: " +  suma); 
       System.out.println("La resta es: " +  resta); 
       System.out.println("La multiplicacion es: " +  multi); 
       System.out.println("La divicion es: " +  div); 
       
    }
}
