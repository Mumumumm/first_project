public class Exam01 {
    // 정적메서드 생성 1
    public static int div() {
        int a = 10, b = 5;
        int result = a / b;
        // 반환값이 있기 때문에 void 없음
        return result;
    }

    // 입력과 출력이 있는 메서드 2
    public static int add(int x, int y) { // 리턴 값이 있어서 void 제외
        return x + y;
    }

    // 반환값이 없는 메서드 선언하고 호출 3
    public static void calculate(int x, double y) {
        System.out.println(2 * x * y);
    }


    // Main 으로 출력될곳
    public static void main(String[] agrs) {
        // 1
        int num = div();
        System.out.println(num);

        // 2
        int a = 5, b = 6;
        int plus = add(a, b); // a와 b는 각각 int x,y에 들어간다
        System.out.println(plus);

        // 3
        int c = 4;
        double d = 3.14;
        System.out.println("원의 둘레를 구하는공식 : 2 * 반지름 * 원주율");
        System.out.print("2 *" + c + "*" + d + " = ");
        calculate(c, d);

    }
}
