import java.util.Scanner;

public class Star {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        System.out.println("길이 : " + len);

        // 별찍기
        for(int i = 0; i < len; i++ ){
            // 공백 용
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // 별 생성용
            for (int j = 0; j < (len * 2) - 1 -(i * 2); j++ ){
                System.out.print("*");
            }
            // 줄띄우기
            System.out.println();
        }
    }
}
