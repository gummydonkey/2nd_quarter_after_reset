
/**
 * df
 package les2;
 
public class df {

    public static void main(String[] args) {
        // МАССИВЫ:
        // Одномерные:
        int[] arrayOfIntegers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.println("");

        double[] arrayOfDoubles = new double[10];
        System.out.println(Arrays.toString(arrayOfDoubles));

        for (int i = 0; i < arrayOfDoubles.length; i++) {
            arrayOfDoubles[i] = new Random().nextDouble();
        }
        System.out.println("");

        for (double element : arrayOfDoubles) {
            System.out.printf("%.2f ", element);
        }

        System.out.printf("%d, %.2f", arrayOfIntegers[0], arrayOfDoubles[arrayOfDoubles.length - 1]);
        System.out.println("\n");

        // Многомерные:
        int[] matrix[] = new int[9][9];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = row * column;
            }
        }
        System.out.println(matrix);
        System.out.println(Arrays.toString(matrix));
        System.out.println("");

        for (int[] row:
             matrix) {
            for (int element:
                 row) {
                System.out.printf("\t%d", element);
            }
            System.out.println("");
        }
    }
}*/ 