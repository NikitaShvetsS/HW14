import exceptions.DataException;
import exceptions.SizeException;

public class Main {
    public static void main(String[] args) {

        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "O"}
        };

        try {
            ArrayValueCalculator calculator = new ArrayValueCalculator();
            int result1 = calculator.doCalc(array1);
            System.out.println("Result 1: " + result1);
            int result2 = calculator.doCalc(array2);
            System.out.println("Result 2: " + result2);
        } catch (SizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (DataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
        }
    }
}