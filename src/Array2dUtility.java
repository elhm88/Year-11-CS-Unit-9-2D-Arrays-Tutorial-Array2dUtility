
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int rows, int columns) {
        int[][] integers = new int[rows][columns];
        System.out.println(integers);
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] integers) {
        int sum = 0;

        for (int[] row : integers) {
            for (int col : row) {
                sum += col;
            }
        }

        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] integers) {
        double avg = 1.0*sum(integers) / (integers.length* integers.length);
        return avg;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] integers) {
        int min = integers[0][0];

        for (int[] row : integers) {
            for (int col : row) {
                if (col < min) {
                    min = col;
                }
            }
        }

        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] integers) {
        int max = integers[0][0];

        for (int[] rows : integers) {
            for (int col : rows) {
                if (col > max) {
                    max = col;
                }
            }
        }

        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] integers) {
        int count = 0;

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                if (integers[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] integers) {
        int count = 0;

        for (int[] rows : integers) {
            for (int col : rows) {
                if (col % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] integers) {
        boolean all = true;

        for (int[] rows : integers) {
            for (int col : rows) {
                if (col < 0) {
                    all = false;
                }
            }
        }

        return all;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] integers) {
        int[] myArray = new int[integers.length];
        int temp = 0;

        for (int i = 0; i < integers.length; i++) {
            temp = 0;
            for (int j = 0; j < integers[i].length; j++) {
                temp += integers[i][j];
            }
            myArray[i] = temp;
        }
        return myArray;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] integers) {
        int[] myArray = new int[integers.length];

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                myArray[j] += integers[i][j];
            }
        }

        return myArray;
    }
}
