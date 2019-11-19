package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'Y';
        switch (switchValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Value was not A, B, C, D or E");
                break;
        }

        String month = "JANuaRy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "august":
                System.out.println("Aug");
                break;
            default:
                System.out.println("Month unknown");
                break;
        }
    }
}
