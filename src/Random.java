import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 랜덤 숫자 배열 넣기
        int[] baseBall = new int[3];

        int countNum = 0;
        while (true){
            boolean flag = false;
            int num = (int)(Math.random() * 10);
            for(int i = 0; i < baseBall.length; i++){
                if(num == baseBall[i]){
                    flag = true;
                    break;
                }
            }
            if (flag){
                continue;
            }
            baseBall[countNum++] = num;
            if (countNum == 3){
                break;
            }
        }


        int count = 1;

        while (true) {
            int[] answer = new int[3];
            int strike = 0;
            int ball = 0;

            for (int i = 0; i < answer.length; i++) {
                System.out.println("정답 시도");
                answer[i] = input.nextInt();
            }
            boolean flag = false;
            for (int i = 0; i < baseBall.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (baseBall[i] == answer[j]) {
                        flag = true;
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            if (!flag) {
                System.out.println("Out");
            }
            System.out.print("Strike : " + strike + " Ball : " + ball);
            System.out.println(); // 줄바꿈용
            count++;
            if (strike == 3) {
                break;
            }
        }
        System.out.println("정답은 : " + baseBall[0] + baseBall[1] + baseBall[2] + " 시도하신 횟수 : " + count);
    }
}
