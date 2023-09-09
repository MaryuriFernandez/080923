package pkg080923;
import exercise.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int limitObject = 3;
        Persona[] arrayPerson = new Persona[limitObject];
        
        Scanner scan = new Scanner(System.in);
        
        // Generar ciclo para guardar estos datos en los limite que el programa defina ingresando todo por teclado
        
        
        for(int i = 0; i < limitObject; i++){
         System.out.println("Ingrese los valores de: Nombre - Documento - Ciudad para la persona: " + i);
         arrayPerson[i] = new Persona(scan.nextLine(), scan.nextLine(), scan.nextLine());
        }
       
            System.out.println("____________________________________");
        for (int i = 0; i < limitObject; i++) {
            System.out.println("person: " +i);
            System.out.println("Name: " + arrayPerson[i].getName());
            System.out.println("Document: " + arrayPerson[i].getDocument());
            System.out.println("City: " + arrayPerson[i].getCountry());
            System.out.println("____________________________________");
        }
       
    }
    
}
