public class ArrayValueCalculator {
    class ArraySizeException extends Exception {
        public ArraySizeException(String message) {
            super(message);
        }
    }
    class ArrayDataException extends Exception {
        public ArrayDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public int doCalc(String[][] array)  throws ArraySizeException, ArrayDataException {

        if (array.length != 4) {
            throw new ArraySizeException("Invalid array size");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Invalid array size");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in cell: [" + i + "][" + j + "]", e);
                }
            }
        }
        return sum;
    }
}
