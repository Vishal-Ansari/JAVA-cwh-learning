import javax.swing.SortingFocusTraversalPolicy;

public class _02_arrayss {
    public static void main(String[] args) {
        // int [] marks= new int[4];
        int[] marks;
        marks = new int[4];
        // int [] marks={100,200,400,201};
        marks[0] = 4;
        marks[1] = 5;
        marks[2] = 6;
        marks[3] = 7;
        System.out.println(marks[3]);

        int[][] mat1 = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] mat2 = { { 2, 8, 4 },
                { 7, 8, 6 } };
        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 } };

        for (int i = 0; i < mat1.length; i++) {// row no of times
            for (int j = 0; j < mat1[i].length; j++) {// column no of times
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        System.out.println("printing the element of the result array");
        for (int i = 0; i < mat1.length; i++) {// row no of times
            for (int j = 0; j < mat1[i].length; j++) {// column no of times
                   System.out.print(result[i][j]+" ");
                                     
                }
                System.out.println("");
        }
    }
}