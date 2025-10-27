public class Question4 {
    public static void main(String[] args) {
        int noteTheorique = 65;
        int notePratique = 72;
        int assiduite = 96;

        if (noteTheorique >= 70 && notePratique >= 75 && assiduite >= 85) {
            System.out.println("Candidat retenu");
        } else if ((noteTheorique >= 60 && notePratique >= 70) || assiduite > 95) {
            System.out.println("Candidat à revoir");
        } else {
            System.out.println("Candidat rejeté");
        }
    }
}
