import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = 1; // 카운트용
        int[] baseBall = {3, 6, 7};

        while (true) {
            int[] input = new int[3];

            System.out.println("숫자 3개를 입력하세요 0 ~ 9 까지");
            for (int i = 0; i < input.length; i++) { // 숫자 입력칸
                int numberBall = s.nextInt();
                input[i] = numberBall;
            }

            for (int i = 0; i < input.length; i++) { // 계산하기
                    if (input[i] == baseBall[i]) {
                        System.out.print("스트라이크 ");
                    } else if (input[i] == baseBall[0] || input[i] == baseBall[1] || input[i] == baseBall[2]) {
                        System.out.print("볼 ");
                    } else {
                        System.out.print("아웃 ");
                    }
            }
            System.out.println();

            if(baseBall[0] == input[0] && baseBall[1] == input[1] && baseBall[2] == input[2]){
                break;
            }
            count++;
        }
        System.out.println("정답입니다 시도하신 횟수 : " + count + "회");
    }

}