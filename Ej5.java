/*Crear un arreglo multidimensional que guarde más datos personales tus
compañeros de clase (nombre, apellido, carrera, lugarTrabajo), tomando 
como referencia de la información colocada en el foro Conociendonos. Llenar 5 registros*/
//Sasha Stephany Villeda Banegas 201810040089

package modulo1;

public class Ej5 {
    
   public static void main(String[] args) {
        
        String[][] Info = new String[5][4];
        Info[0][0] = "Erick     ";
        Info[0][1] = "Ulloa     ";
        Info[0][2] = "Ing. Electronica ";
        Info[0][3] = "Textiles Merendon      ";
        
        Info[1][0] = "Brayan     ";
        Info[1][1] = "Aleman     ";
        Info[1][2] = "Ing. Industrial      ";
        Info[1][3] = "Estudiante      ";
        
        Info[2][0] = "Ramon     ";
        Info[2][1] = "Flores     ";
        Info[2][2] = "Ing. Sistemas      ";
        Info[2][3] = "Ecommerce      ";
        
        Info[3][0] = "Dayana     ";
        Info[3][1] = "Osorio     ";
        Info[3][2] = "Ing. Industrial      ";
        Info[3][3] = "Estudiante      ";
        
        Info[4][0] = "Maria     ";
        Info[4][1] = "Rivas     ";
        Info[4][2] = "Ing. Electronica      ";
        Info[4][3] = "Estudiante      ";

        System.out.println("Nombre     Apellido       Carrera         Trabajo ");
        System.out.println(Info[0][0] + Info[0][1] + Info[0][2]+Info[0][3]);
        
        System.out.println(Info[1][0] + Info[1][1] + Info[1][2]+Info[1][3]);
        
        System.out.println(Info[2][0] + Info[2][1] + Info[2][2]+Info[2][3]);
       
        System.out.println(Info[3][0] + Info[3][1] + Info[3][2]+Info[3][3]);
  
        System.out.println(Info[4][0] + Info[4][1] + Info[4][2]+Info[4][3]);
        
      
    }
}

