public class ProfesseursIf {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        int resultat = a++ + (--b % 5);

        System.out.println("a = " + ++a);
        System.out.println("b = " + b);
        System.out.println("c = " + c--);
        System.out.println("resultat = " + resultat); 

        String professeur;
        if (a % 3 == 0) {
            professeur = "David";
        } else if (a % 3 == 1 && b > 5) {
            professeur = "Maxime";
        } else if (a % 3 == 2 || c < 20) {
            professeur = "Shany";
        } else {
            professeur = "Professeur inconnu";
        }

        System.out.println("Professeur choisi : " + professeur);
    }
}
