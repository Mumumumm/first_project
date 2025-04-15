import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 최대값 최소값 넣기
        System.out.print("숫자를 입력하세요 ");
        int num = input.nextInt();
        int max = num;
        int min = num;

        for (int i = 1; i < 10; i++) {
            System.out.print("숫자를 입력하세요 ");
            num = input.nextInt();
            if (num > max) {
                max = num;
            } else if (min > num) {
                min = num;
            }
        }
        System.out.println("큰숫자 : " + max + " 최소값 : " + min);


    }
}
