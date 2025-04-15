public class Overroding {
    // 리턴값이 없는 오버로딩 메서드
    public static void calculate(int x, int y) {
        System.out.println(x * y);
    }

    public static void calculate(int x) {
        System.out.println(x * x);
    }

    public static void calculate(int x, double y) {
        System.out.println(x * y);
    }

    public static void calculate(double x, double y) {
        System.out.println(x * y);
    }

    // 리턴값이 있는 오버로딩 메서드
    public static int sum(int x, int y) {
        return (x * y);
    }

    public static int sum(int x, int y, int z) {
        return (x * y * z);
    }
    public static double sum(double x, double y){
        return (x * y);
    }

    public static void main(String[] args) {
        // 반환값 없는 것
        calculate(2, 2);
        calculate(2);
        calculate(2, 3.14);
        calculate(2.5, 3.5);
        System.out.println("==========================================");
        // 반환값 있는 것
        System.out.println(sum(3,5));
        System.out.println(sum(3,4,5));
        System.out.println(sum(3.6,2.5));
    }
}
