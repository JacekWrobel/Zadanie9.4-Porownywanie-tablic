public class ArrayComparator {
    boolean result;

    static boolean compare(int[] array1, int[] array2) {
        int i = 0;
        if (array1.length == 0 || array2.length == 0) {
            return false;
        } else if (array1[i] == 0 || array2[i] == 0) {
            return false;
        } else if (array1.length != array2.length) {
            return false;
        } else
            for (i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        return true;
    }

    static boolean compare(int[][] array1, int[][] array2) {
        int i = 0;
        int j = 0;
        if (array1.length == 0 || array2.length == 0) {
            return false;
        } else if (array1[i][j] == 0 || array2[i][j] == 0) {
            return false;
        } else if (array1.length != array2.length) {
            return false;
        } else
            for (i = 0; i < array1.length; i++)
                for (j = 0; j < array2.length; j++)
                    if (array1[i][j] != array2[i][j]) {
                        return false;
                    }
        return true;
    }
}

