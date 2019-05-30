public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = {};
        int[] array2 = {};
        boolean result = ArrayComparator.compare(array1, array2);
        System.out.println(result);

        int[][] array3 = {{0}, {1}};
        int[][] array4 = {{0}, {1}};

        boolean result2 = ArrayComparator.compare(array3,array4);
        System.out.println(result2);

    }
}
