import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
import java.util.Scanner;

public class AsciiOneStylized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la dimension (nombre de lignes) : ");
        int n = sc.nextInt();

        // Vérification pour assurer un rendu correct
        if (n < 9 || n % 3 != 0) {
            System.out.println("Veuillez entrer une valeur d'au moins 9 et divisible par 3 pour un bon résultat.");
            return;
        }

        int section = n / 3; // Hauteur du chapeau et du pied

        for (int i = 0; i < n; i++) {
            // Haut (le chapeau du 1)
            if (i < section / 2) {
                System.out.println("1111");
            } 
            else if (i < section) {
                System.out.println(" 11111");
            }
            // Corps du 1
            else if (i < n - section) {
                System.out.println("   111");
            }
            // Pied du 1
            else {
                System.out.println("  11111111");
            }
        }

        sc.close();
    }
}
    }
    

}
