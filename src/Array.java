import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        // 1차원 배열 선언
//        // 인덱스 마다 하나씩 넣어보기
//        int[] myArr = new int[5];
//        myArr[0] = 10;
//        myArr[1] = 20;
//        myArr[2] = 30;
//        myArr[3] = 40;
//        myArr[4] = 50;
//        for (int i = 0; i < myArr.length; i++) {
//            System.out.println(myArr[i]);
//        }
//
//        System.out.println("========================================================================");
//
//        // 문자열 저장하고 출력하기
//        String[] strArr = new String[3];
//        System.out.println("문자를 3가지 입력");
//
//        for (int j = 0; j < strArr.length; j++) { // 입력값 적기 strArr배열 길이만큼
//            strArr[j] = s.nextLine();
//        }
//
//        for (int j = 0; j < strArr.length; j++) {
//            System.out.println(strArr[j]);
//        }
//
//        System.out.println("========================================================================");
//
//        // 1차원 배열 초기화 직접 넣기 방식
//        int[] numberArr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numberArr.length; i++) {
//            System.out.print(numberArr[i] + " " + "\n");
//        }
//
//        System.out.println("========================================================================");
//
//        // 1차원 배열을 활용한 평균값 구하기
//        double[] gradeArr = {90, 70.5, 87, 65.5, 89.7, 99, 95.5};
//        double sum = 0.0;
//
//        for (int i = 0; i < gradeArr.length; i++){
//            sum += gradeArr[i];
//        }
//
//        double average = sum/ gradeArr.length;
//        System.out.println("합계 : " + sum);
//        System.out.println("평균 : %.2f = " + average);
//
//        System.out.println("========================================================================");

        // 2차원 배열
        int[][] my_Arr = new int[2][4];
        my_Arr[0][0] = 2;
        my_Arr[0][1] = 5;
        my_Arr[0][2] = 7;
        my_Arr[0][3] = 4;
        my_Arr[1][0] = 9;
        my_Arr[1][1] = 7;
        my_Arr[1][2] = 2;
        my_Arr[1][3] = 8;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < my_Arr[0].length; i++) {
            sum1 += my_Arr[0][i];
        }
        System.out.print("0행의 합계 : " + sum1 + "\n");
        for (int j = 0; j < my_Arr[1].length; j++) {
            sum2 += my_Arr[1][j];
        }
        System.out.print("1행의 합계 : " + sum2 + "\n");

        // 과목 평균 점수 구하기
        double[][] marks = new double[2][3];
        for (int i = 0; i < marks.length; i++) { // i번째의 학생 점수 값 구하기
            System.out.println("학생 번호 " + (i + 1));
            System.out.print("국어 점수 : "); // i번째 학생의 0번째 인덱스 열의 점수
            marks[i][0] = s.nextDouble();

            System.out.print("수학 점수 : "); // i번째 학생의 1번째 인덱스 열의 점수
            marks[i][1] = s.nextDouble();

            marks[i][2] = (marks[i][0] + marks[i][1] / 2); // 평균값 구하기
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("학생번호 " + (i + 1));
            System.out.print("국어 : " + marks[i][0]);
            System.out.print("수학  : " + marks[i][1]);
            System.out.print("평균 : " + marks[i][2] + "\n");
        }

        // 2차원 배열 초기화
        int[][] number_Arr = {{10, 20, 30, 40}, {50, 60, 70, 80}, {11, 22, 33, 44, 55}};
        for (int i = 0; i < number_Arr.length; i++) {
            for (int j = 0; j < number_Arr[i].length; j++) {
                System.out.print(number_Arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("number_Arr[0][3]의 값 : " + number_Arr[0][3]);

        // 두 행렬의 값 구하기
        int rows = 2, columns = 3;
        int[][] firstMatrix = {{2, 3, 4}, {3, 2, 1}};
        int[][] secondMatrix = {{1, 2, 3}, {-4, -2, 1}};

        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
            System.out.println("두 행렬의 합 :");
            for (int a = 0; a < rows; a++){
                for (int b = 0; b < columns; b++){
                    System.out.print(sum[a][b] + " ");
                }
            }
            System.out.println();
        }
    }
}
