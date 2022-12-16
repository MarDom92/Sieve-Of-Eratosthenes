import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    boolean[] isPrimeNumber;
    int sizeOfPrimeNumbersArray;

    public SieveOfEratosthenes(int size) {
        isPrimeNumber = new boolean[size + 1];
        sizeOfPrimeNumbersArray = isPrimeNumber.length;
    }

    public void setInitialValues() {
        for (int i = 0; i < sizeOfPrimeNumbersArray; i++) {
            isPrimeNumber[i] = true;
        }
    }

    public void searchPrimeNumbers() {
        double squareRootOfSize = Math.sqrt(sizeOfPrimeNumbersArray);

        for (int i = 2; i < squareRootOfSize; i++) {
            if (isPrimeNumber[i]) {
                for (int j = 2; i * j < sizeOfPrimeNumbersArray; j++) {
                    isPrimeNumber[i * j] = false;
                }
            }
        }
    }

    public List<Integer> getPrimeNumbers() {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i < sizeOfPrimeNumbersArray; i++) {
            if (isPrimeNumber[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
