import java.util.Scanner;

public class Star2 {
    public static void titleDisplay(){
        System.out.println("===============================");
        System.out.println("===============================");
    }

    public void testDisplay(){
        System.out.println("***************************");
    }


    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        for (int i = 0 ; i < len; i++){ // 한 줄 반복
            // 공백용
            for (int j = 0; j < i; j++){ // j 가 i보다 작을때 실행 함
                System.out.print(" ");
            }
            // 별찍기용
            for (int k = 0; k < len - (i * 1); k++ ){ // k는 len - i반복 * 1 보다 작을때만 k++
                System.out.print("*");
            }
            System.out.println();
        }


        for (int a = 0; a < len; a++){
            for(int b = 0; b < len - 1 ; b++){ // 공백
                System.out.print(" ");
            }
            for(int c = 0; c < len - (a * 1); c++){ // 별찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
