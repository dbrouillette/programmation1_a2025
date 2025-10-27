public class Question7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        boolean resultat = (a < b && b < c) || (a + c == b);
        System.out.printf("%s", resultat);
    }
}

