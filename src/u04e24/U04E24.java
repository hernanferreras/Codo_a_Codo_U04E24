
package u04e24;
        
import java.util.Scanner;
public class U04E24 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int peso, contadorPeso=0, contadorAlumnos=0;
        float promPeso;
        do{
            System.out.println("Ingrese el peso del alumno: ");
            peso = entrada.nextInt();
            contadorPeso = contadorPeso+peso;
            contadorAlumnos++;
        }
        while(peso!=0);
        promPeso=(contadorPeso/(contadorAlumnos-1));
        System.out.println("El promedio de peso en el curso es de: "+promPeso);
    }
    
}