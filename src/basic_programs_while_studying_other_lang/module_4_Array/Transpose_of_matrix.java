package basic_programs_while_studying_other_lang.module_4_Array;

public class Transpose_of_matrix {
    static void main() {
        int[][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] B = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[j][i] = A[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
