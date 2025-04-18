import java.awt.*;
import java.sql.Struct;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SPEED = 20;
        int count = 5;
        //SPEED = 10; // 에러 final 은 고정값이기 때문에
        count = 10;
        System.out.println("SPEED 값은 :" + SPEED);
        System.out.println("count 값은 :" + count);

        final double PI = 3.14;
        System.out.println("PI 값은 :" + PI);
        System.out.println("3 * 3 * PI :" + 3 * 3 * PI);

        // 정수
        int a = 10;
        short b = 20;
        byte c = 5;
        long d = 123456789011L;
        System.out.println("a :" + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);

        // 실수
        float f = 65.20298f;
        double db = 876.765d;
        System.out.println("f : " + f);
        System.out.println("db : " + db);

        // 문자형 문자는 '' 로
        char ch1 = 'j';
        char ch2 = 'a';
        char ch3 = 'v';
        char ch4 = 'a';
        System.out.println("ch1 : " + ch1);
        System.out.println("ch1 : " + ch2);
        System.out.println("ch3 : " + ch3);
        System.out.println("ch4 : " + ch4);
        System.out.println("문자들 : " + ch1 + ch2 + ch3 + ch4);

        // 문자열 ""로
        String str1 = "Welcome";
        String str2 = "Java~";
        String str3 = "Program";
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("문자열끼리 합치기 : " + str1 + str2 + str3);

        // Boolean
        boolean tru = true;
        boolean fal = false;
        System.out.println(tru);
        System.out.println(fal);
        System.out.println("이것은 참이다 : " + tru);
        System.out.println("이것은 거짓이다 : " + fal);
        System.out.println("참을 부정할 수 있다  : " + !tru);
        System.out.println("거짓을 부정할 수 있다 : " + !fal);

        // 이스케이프 문자 출력 및 문자열과 변수 결합
        String myName = "김준홍";
        int myAge = 20;
        System.out.println("이름 : " + myName);
        System.out.println("나이 : " + myAge);
        System.out.println("이름 : \t " + myName);
        System.out.println("나이 : \t " + myAge);

        // 증감 및 감소 연산자
        int a1 = 10, b1 = 10, c1 = 10, d1 = 10;

        System.out.println("a1++ 은 a가 먼저 출력 되고 뒤에 ++ : " + (a1++));
        System.out.println("a1이 증가 되었는지 확인 : " + a1);
        System.out.println("++b1 은 b가 나중에 출력되고 앞에 ++ : " + (++b1));
        System.out.println("c1-- 는 c가 먼저 출력 되고 뒤에 -- : " + (c1--));
        System.out.println("c1이 감소 되었는지 확인 : " + c1);
        System.out.println("--d1 은 d가 나중에 출력되고 앞에 -- " + (--d1));
        System.out.println("우선 감소된 d + 우선 증가된 b : " + (d1 + b1));

        // 캐스팅 형 변환
        double db1 = 3.14;
        long l1 = (long) db1;
        int i1 = (int) l1;
        System.out.println("db1 : " + db1);
        System.out.println("l1 은 db1을 흡수 " + l1);
        System.out.println("l1 은 결과값 : " + l1);
        System.out.println("int 에 억지로 넣을때 : " + i1);

        //형의 변환
        int x = 10;
        double y = 3.0;
        System.out.println(x / y);
        System.out.println((x / (int) y));
        System.out.println((int) (x / y));

        // Scanner
        // 문자열
        Scanner input = new Scanner(System.in); // 스캐너 생성

//        System.out.print("이름을 적어주세요");
//        String name = input.nextLine();
//        System.out.println("너의 이름은 : " + name);
//
//        // 정수
//
//        System.out.print("나이를 적어주세요");
//        int Age = input.nextInt();
//        System.out.println("나이는? : " + Age);
//
//        // 실수
//
//        System.out.print("소수점 숫자를 입력해보세요"); // 입력 문구 출력
//        double resultDouble = input.nextDouble(); // 소수값 입력
//        System.out.println("입력한 실수 : " + resultDouble); // 결과 출력
//
//        // 예제 랑 nextInt 의 함정
//        System.out.print("메뉴 번호를 선택해주세요\t");
//        int number = input.nextInt(); // 스캐너 nextInt 저장 selectNumber 에 대입
//        System.out.println(number + "번을 선택했습니다"); // 내용 출력
//        input.nextLine();  // ← 줄바꿈(엔터) 제거용 ✅ 이유: nextInt()는 줄바꿈(Enter)을 소비하지 않음
//
//        String str = input.nextLine();
//        System.out.println("내가 입력한 문자열은 : " + str + " 입니다.");

//        int max;
//        int min;
//        System.out.println("숫자를 입력하세요");
//        int result = input.nextInt();
//        int result2 = input.nextInt();
//        if(result > result2){
//             max = result;
//        }else if (result < result2){
//            min = result;
//        }
//        System.out.println("큰숫자 : " + result);


//        for (int num = 0; num < 10 ; num++){
//
//            result = input.nextInt();
//        };

        KittenCat kitten = new KittenCat("김준홍","김서서");
        Child2 hong = new Child2();

    }
}