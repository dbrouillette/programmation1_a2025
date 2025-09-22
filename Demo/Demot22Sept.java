package Demo;

import java.util.Scanner;

public class Demot22Sept {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nombre; 
    boolean quitter = false; // variable de contrôle

    while (!quitter) { // ou quitter == false
    System.out.print("Entrez un nombre (0 pour quitter) : ");
    nombre = scanner.nextInt();
    if (nombre == 0) {
        quitter = true; // la variable de contrôle change de valeur
    }
    System.out.println("Vous avez entré : " + nombre);
    }

    }
}
