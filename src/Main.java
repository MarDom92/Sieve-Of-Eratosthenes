import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size = getNumberFromUser();

        SieveOfEratosthenes sieve = new SieveOfEratosthenes(size);
        sieve.setInitialValues();
        sieve.searchPrimeNumbers();
        List<Integer> primeNumbers = sieve.getPrimeNumbers();

        printList(primeNumbers);
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj końcowy przedział zakresu, dla którego wyznaczyć liczby pierwsze:");
        return scanner.nextInt();
    }

    private static void printList(List<Integer> list) {
        System.out.println("Liczby pierwsze w podanym zakresie to:");

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}