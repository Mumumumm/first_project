import java.util.Scanner;

public class Array2 {
    public static void printSquareArr(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("[" + nums[i][j] + "] \t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /**
         *        0      1      2      3
         *  0    [1]    [2]    [3]   [0행]
         *  1    [4]    [5]    [6]   [1행]
         *  2    [7]    [8]    [9]   [2헹]
         *  3   [0열]  [1열]  [2열]  [총합]
         */

        /**
         * 0,0 => 0,3 | 3,0 | 3,3
         * 0,1 => 0,3 | 3,1 | 3,3
         * 0,2 => 0,3 | 3,2 | 3,3
         */
        int[][] myArr = new int[4][4];
        int rows = myArr.length;
        int columns = myArr[0].length;

        for (int i = 0; i < myArr.length - 1; i++) { // 4행의 길이
            for (int j = 0; j < myArr[i].length - 1; j++) { // 4열의 길이
                System.out.println(i + "," + j + "번 째 숫자를 입력해주세요 "); // 입력 9번
                myArr[i][j] = s.nextInt();
                printSquareArr(myArr);
            }
        }
        for (int i = 0; i < myArr.length - 1; i++) { // 계산
            for (int j = 0; j < myArr[i].length - 1; j++) {
                myArr[i][myArr.length - 1] += myArr[i][j];
                myArr[myArr.length - 1][j] += myArr[i][j];
                myArr[myArr.length - 1][myArr.length - 1] += myArr[i][j];
            }
        }
        // 합계 출력

        for (int i = 0; i < rows - 1; i++) {
            System.out.print("행의 합계 : " + myArr[i][columns - 1] + " \n");
        }
        for (int i = 0; i < columns - 1; i++) {
            System.out.print("열의 합계 : " + myArr[rows - 1][i] + " \n");
        }
        System.out.println("열과 행의 합계 : " + myArr[rows - 1][columns - 1]);
        printSquareArr(myArr);


    }
}
