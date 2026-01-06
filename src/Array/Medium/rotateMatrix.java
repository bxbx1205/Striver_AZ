package Array.Medium;

import java.util.Arrays;

public class rotateMatrix {
    static void main(String[] args) {
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9},

        };

        rotate(matrix);
                System.out.println(Arrays.toString(matrix));

    }

    static public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length ; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }



        for (int i = 0; i < matrix.length; i++) {
            int start =0;
            int end = matrix.length-1;

            while(start<end){
                int temp= matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        return;
    }
}
