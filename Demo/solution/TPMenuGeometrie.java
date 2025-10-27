import java.util.Scanner;

public class TPMenuGeometrie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (true) {
            System.out.println("\n=== MENU GÉOMÉTRIE ===");
            System.out.println("1. Calculer l’aire d’un cercle");
            System.out.println("2. Calculer l’aire d’un triangle isocèle");
            System.out.println("3. C'est terminé! J'en ai assez");
            System.out.print("Votre choix : ");

            // Validation du choix
            if (sc.hasNextInt()) {
                choix = sc.nextInt();
            } else {
                System.out.println("Erreur : vous devez entrer un nombre entre 1 et 3.");
                sc.next(); // on vide la mauvaise entrée
                continue;
            }

            if (choix == 1) {
                // Aire d'un cercle
                double rayon = 0;
                do {
                    System.out.print("Entrez le rayon du cercle (>0) : ");
                    if (sc.hasNextDouble()) {
                        rayon = sc.nextDouble();
                        if (rayon <= 0) {
                            System.out.println("Erreur : le rayon doit être positif.");
                        }
                    } else {
                        System.out.println("Erreur : vous devez entrer un nombre.");
                        sc.next(); // vider
                    }
                } while (rayon <= 0);

                double aire = Math.PI * rayon * rayon;
                System.out.printf("L’aire du cercle est : %.2f%n", aire);

            } else if (choix == 2) {
                // Aire d’un triangle isocèle
                double base = 0, hauteur = 0;

                do {
                    System.out.print("Entrez la base du triangle (>0) : ");
                    if (sc.hasNextDouble()) {
                        base = sc.nextDouble();
                        if (base <= 0) {
                            System.out.println("Erreur : la base doit être positive.");
                        }
                    } else {
                        System.out.println("Erreur : vous devez entrer un nombre.");
                        sc.next(); // vider
                    }
                } while (base <= 0);

                do {
                    System.out.print("Entrez la hauteur du triangle (>0) : ");
                    if (sc.hasNextDouble()) {
                        hauteur = sc.nextDouble();
                        if (hauteur <= 0) {
                            System.out.println("Erreur : la hauteur doit être positive.");
                        }
                    } else {
                        System.out.println("Erreur : vous devez entrer un nombre.");
                        sc.next(); // vider
                    }
                } while (hauteur <= 0);

                double aire = (base * hauteur) / 2;
                System.out.printf("L’aire du triangle isocèle est : %.2f%n", aire);

            } else if (choix == 3) {
                System.out.println("Merci d’avoir utilisé le programme. À bientôt!");
                break;
            } else {
                System.out.println("Erreur : choix invalide. Veuillez entrer 1, 2 ou 3.");
            }
        }

        sc.close();
    }
}
