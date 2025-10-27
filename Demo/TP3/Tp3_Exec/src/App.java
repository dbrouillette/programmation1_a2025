import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Constantes ANSI pour les couleurs du texte
        final String RESET = "\u001B[0m";
        // final String NOIR = "\u001B[30m";
        final String ROUGE = "\u001B[31m";
        final String VERT = "\u001B[32m";
        final String JAUNE = "\u001B[33m";
        final String BLEU = "\u001B[34m";
        final String MAGENTA = "\u001B[35m";
        // final String CYAN = "\u001B[36m";
        // final String BLANC = "\u001B[37m";
        // Constantes ANSI pour les fonds
        // final String FOND_ROUGE = "\u001B[41m";
        // final String FOND_VERT = "\u001B[42m";
        // final String FOND_JAUNE = "\u001B[43m";
        // final String FOND_BLEU = "\u001B[44m";
        // final String FOND_MAGENTA = "\u001B[45m";
        // final String FOND_CYAN = "\u001B[46m";
        // final String FOND_BLANC = "\u001B[47m";

        final int CHOIX_1 = 1;
        final int CHOIX_2 = 2;
        final int CHOIX_3 = 3;
        final int CHOIX_QUITTER = 5;
        final String NOM_OPTION_1 = "Motif en rectangle vers... (le haut / la droite)";
        final String NOM_OPTION_2 = "Affichage d'un losange (vide ou plein)";
        final String NOM_OPTION_3 = "Motif surprise!";
        final String NOM_OPTION_QUITTER = "Quitter";
        final int ORIENTATION_HAUT = 1;
        final int ORIENTATION_BAS = 2;
        final int ORIENTATION_GAUCHE = 3;
        final int ORIENTATION_DROITE = 4;
        int orientation = ORIENTATION_DROITE; // à modifier selon les groupes
        final int TAILLE_MIN = 1;
        final int TAILLE_MAX = 25;
        final int TAILLE_PAR_DEFAUT = 10;
        final Scanner saisie = new Scanner(System.in);
        int choixMenu = -1;
        int taille = 0;
        boolean tailleValide = false;

        do {
            // AFFICHAGE DU MENU
            System.out.println(BLEU + "\nTP3 - GÉNÉRATEUR DE MOTIFS" + RESET);
            System.out.println("Choisir l'une des options suivantes");
            System.out.printf("%d. %s%n", CHOIX_1, NOM_OPTION_1);
            System.out.printf("%d. %s%n", CHOIX_2, NOM_OPTION_2);
            System.out.printf("%d. %s%n", CHOIX_3, NOM_OPTION_3);
            System.out.printf("%d. %s%n", CHOIX_QUITTER, NOM_OPTION_QUITTER);
            System.out.print("Votre choix : " + VERT);
            if (saisie.hasNextInt()) {
                choixMenu = saisie.nextInt();
                switch (choixMenu) {
                    case CHOIX_1:
                        break;
                    case CHOIX_2:

                        System.out.println("    V");
                        System.out.println("   VVV");
                        System.out.println("  VVVVV");
                        System.out.println(" VVVVVVV");
                        System.out.println("VVVVVVVVV");
                        System.out.println(" VVVVVVV");
                        System.out.println("  VVVVV");
                        System.out.println("   VVV");
                        System.out.println("    V");

                        saisie.nextLine(); // FTB
                        System.out.println("\n" + MAGENTA + CHOIX_2 + ". " + NOM_OPTION_2 + RESET);
                        taille = TAILLE_MIN + (int) (Math.random() * (TAILLE_MAX - TAILLE_MIN + 1));
                        System.out.println("Taille du losange : " + VERT + taille);
                        System.out.println(JAUNE);
                        for (int i = 1; i <= taille; i++) {
                            for (int j = 1; j <= taille; j++) {
                                if (i <= (taille + 1) / 2) { // Moitié du haut
                                    if (i >= j || j + i > taille)
                                        System.out.print("X");
                                    else
                                        System.out.print(" ");
                                } else { // Moitié du bas
                                    if (i + j <= taille + 1 || j >= i)
                                        System.out.print("X");
                                    else
                                        System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    case CHOIX_3:
                        saisie.nextLine(); // FTB
                        System.out.println("\n" + MAGENTA + CHOIX_3 + ". " + NOM_OPTION_3 + RESET);
                        System.out.println("Taille du triangle : " + VERT + TAILLE_PAR_DEFAUT);
                        System.out.println(JAUNE);
                        // Choix de l'orientation ??
                        switch (orientation) {
                            case ORIENTATION_HAUT:
                                for (int i = 1; i <= TAILLE_PAR_DEFAUT; i++) {
                                    for (int j = 1; j <= TAILLE_PAR_DEFAUT - i; j++) {
                                        System.out.print(" ");
                                    }
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case ORIENTATION_BAS:
                                for (int i = 1; i <= TAILLE_PAR_DEFAUT; i++) {
                                    for (int j = 1; j < i; j++) {
                                        System.out.print(" ");
                                    }
                                    for (int j = i; j <= TAILLE_PAR_DEFAUT; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case ORIENTATION_GAUCHE: /////////////////////////////////////////////
                                for (int i = 1; i <= TAILLE_PAR_DEFAUT * 2; i++) {
                                    // Moitié du haut (croissante)
                                    if (i <= TAILLE_PAR_DEFAUT) {
                                        // Lignes paires : 1 espace au début
                                        if (i % 2 == 0) {
                                            System.out.print(" ");
                                        }
                                        for (int j = 1; j <= (i + 1) / 2; j++) {
                                            System.out.print("* ");
                                        }
                                    }
                                    // Moitié du bas (décroissante)
                                    else {
                                        // Lignes paires : 1 espace au début
                                        if (i % 2 == 0) {
                                            System.out.print(" ");
                                        }
                                        for (int j = 1; j <= TAILLE_PAR_DEFAUT - i / 2; j++) {
                                            System.out.print("* ");
                                        }

                                    }
                                    System.out.println(); // ligne suivante
                                }
                                break;
                            case ORIENTATION_DROITE:
                                for (int i = 1; i <= TAILLE_PAR_DEFAUT * 2; i++) {
                                    // Moitié du haut (lignes 1 à 10)
                                    if (i <= TAILLE_PAR_DEFAUT) {
                                        for (int j = 1; j <= TAILLE_PAR_DEFAUT - i; j++) {
                                            System.out.print(" ");
                                        }
                                        for (int j = 1; j <= (i + 1) / 2; j++) {
                                            System.out.print("* ");
                                        }
                                    }
                                    // Moitié du bas (décroissante)
                                    /*
                                     * else {
                                     * // Lignes paires : 1 espace au début
                                     * if(i % 2 == 0) {
                                     * System.out.print(" ");
                                     * }
                                     * for (int j = 1; j <= TAILLE_PAR_DEFAUT - i/2; j++) {
                                     * System.out.print("* ");
                                     * }
                                     * 
                                     * }
                                     */
                                    System.out.println(); // ligne suivante
                                }
                                break;
                            default:
                                break;
                        }
                        System.out.println(RESET);
                        break;
                    case CHOIX_QUITTER:
                        saisie.nextLine(); // FTB
                        System.out.println(
                                "\n" + MAGENTA + CHOIX_QUITTER + ". " + NOM_OPTION_QUITTER + " ...Au revoir!" + RESET);
                        break;
                    default:
                        System.out.printf(ROUGE + "Choix invalide...%n" + RESET);
                        break;
                }
            } else {
                System.out.printf(ROUGE + "Choisir une option entre %d et %d.%n" + RESET, CHOIX_1, CHOIX_QUITTER);
                saisie.nextLine(); // FTB
            }
        } while (choixMenu != CHOIX_QUITTER);

        System.out.println(RESET);
        saisie.close();
        System.exit(0);

    }

}
