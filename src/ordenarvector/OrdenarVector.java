
package ordenarvector;

import java.util.Scanner;


public class OrdenarVector {


    public static void main(int [] array) {
       
        Scanner leer = new Scanner(System.in);
        int []vector = new int [10];
        int aux, n;
        boolean cambios;
        
        
        System.out.println("Ingrese tamaño de su vector");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor "+i+1+":");
            vector[i]= leer.nextInt();
        }
        while(true){
            cambios = false;
            for (int i = 1; i < n; i++) {
                if (vector[i] < vector[i-1]) {
                    aux = vector[i];
                    vector[i]=vector[i-1];
                    vector[i-1]= aux;
                    cambios = true;
                }
            }
            
            if(cambios == false){
                break;
            }
            
        }
        
    }
    
}
