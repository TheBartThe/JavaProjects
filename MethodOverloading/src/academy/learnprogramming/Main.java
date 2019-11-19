package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("John", 500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();
        calcFeetAndInchesToCentimetres(45);
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            return ((feet * 12) + inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimetres(int inches) {
        if (inches >= 0) {
            double feet = inches / 12;
            double newInches = inches % 12;
            return calcFeetAndInchesToCentimetres(feet, newInches);
        } else {
            return -1;
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
