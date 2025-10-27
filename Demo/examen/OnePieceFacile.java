public class OnePieceFacile {
    public static void main(String[] args) {
        int a = 4, b = 8, c = 12;
        int resultat = a++ + (--b % 5);
        System.out.println("a = " + ++a);
        System.out.println("b = " + b);
        System.out.println("c = " + c--);
        System.out.println("resultat = " + resultat);

        String personnage;
        if (a % 3 == 0) {
            personnage = "Luffy";
        } else if (a % 3 == 1) {
            personnage = "Zoro";
        } else {
            personnage = "Nami";
        }

        System.out.println("Personnage choisi : " + personnage);
    }
}
