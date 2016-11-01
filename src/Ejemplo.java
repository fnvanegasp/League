
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Ejemplo {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File entrada = new File("jugador.txt");
        Scanner lectura = new Scanner(entrada);
        lectura.useDelimiter(",");
        String name = null;
        String lastName;
        int numTournament;
        int numLeagues;
        
        while(lectura.hasNext()){
            name = lectura.next();
            lastName = lectura.next();
            System.out.println(name);
            System.out.println(lastName);
            numTournament = lectura.nextInt();
            
            System.out.println("Tournaments");
            for(int i = 0; i<numTournament; i++){
                System.out.println(lectura.next());
            }
            
            numLeagues = lectura.nextInt();
            System.out.println("Leagues");
            for(int i = 0; i<numLeagues; i++){
                System.out.println(lectura.next());
            }
        }
    }
    
}
