import exceptions.DataException;
import exceptions.SizeException;

public class ArrayValueCalculator {

    public int doCalc(String[][] array)  throws SizeException, DataException {

        if (array.length != 4) {
            throw new SizeException("Invalid array size");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new SizeException("Invalid array size");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new DataException("Invalid data in cell: [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
