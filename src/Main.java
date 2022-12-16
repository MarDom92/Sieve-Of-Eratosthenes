import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = getNumberFromUser();
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj końcowy przedział zakresu, dla którego wyznaczyć liczby pierwsze:");
        return scanner.nextInt();
    }
}