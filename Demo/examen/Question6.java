public class Question6 {
    public static void main(String[] args) {
        int m = 6;
        int n = 2;
        int p = 9;

        boolean resultat = (m * n == p) == (p / n == m);
        System.out.printf("%s", resultat);
    }
}

