/*Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas 
expresiones daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5) */
package modulo1;

public class Ej3 {
    public static void main(String[] args) {
        
    int M = 6;
    int T = 1;
    int K = -10;
    
    System.out.println("M = 6 \nT = 1 \nK = -10 ");  
    System.out.println("\n \n");
        
    if (M > T){
        System.out.println("M > T: Verdadero. \n");
    }else{
        System.out.println("M > T: Falso. \n");
    }
    if (T / K == -5 ){
        System.out.println("T / K == -5 : Verdadero.\n");
    }else{
        System.out.println("T / K == -5 : Falso.\n");
    }
    if((M+T == 7) || (M-T == 5)){
        System.out.println("(M+T == 7) || (M-T == 5): Verdadero.\n");
    }else{
         System.out.println("(M+T == 7) || (M-T == 5): Falso.\n");
    }
    }
}
