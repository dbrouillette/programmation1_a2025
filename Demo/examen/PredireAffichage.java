public class PredireAffichage {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = 12;

        int resultat = a + b - c;

        if (resultat > 0 && b < 10) {
            System.out.println(resultat);
        } else if (b == 8) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

    }
}
