import java.sql.SQLOutput;

public class Example_str {
    public static void main(String[] args) {
        // 문자열 선언
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // 문자열 저장하고 출력하기
        String s5 = "Java Programming";
        String s6 = new String("Java Programming");
        System.out.print("s5 : " + s5 + "\ts6 : " + s6);

        // 문자열 메서드 활용하기
        String s = " Java Programming ";
        System.out.println("s.length() : " + s.length());
        System.out.println("s.charAt(1) : " + s.charAt(1));
        System.out.println("s.substring(6) : " + s.substring(6));
        System.out.println("s.substring(5,13) : " + s.substring(5, 13));
        System.out.println("s.indexOf('P') : " + s.indexOf('P'));
        System.out.println("s.toLowerCase() : " + s.toLowerCase());
        System.out.println("s.toUpperCase() : " + s.toUpperCase());

        // String 클래서 메서드 이용하기
        String str1 = " Java Programming ";
        String str2 = "Java";
        String str3 = " Programming";
        String str4 = str2.concat(str3);
        String str5 = str1.trim();

        System.out.println("str4 = str2.concat(str3): " + str4);
        System.out.println("str5 = str1.trim() : " + str5);
        System.out.println("str4.equals(str5) : " + str4.equals(str5));

        // 문자열 메서드 연산
        String s7 = "JAVA";
        String s8 = "JAVA";
        String s9 = "java";

        System.out.println(s7 == s8);
        System.out.println(s7 != s8);

        System.out.println(s8 == s9);
        System.out.println(s8 != s9);
        String s10 = s8 + s9;
        System.out.println(s10);

        // 문자열 연산자 이용하여 두 문자열 비교하기
        String str6 = new String("Java");
        String str7 = new String("Java");
        String str8 = str6;

        if(str6 == str7){
            System.out.println("str6 과 str7은 같다");
        }else {
            System.out.println("str6 과 str6은 같지 않다");
        }

        if(str6 == str8){
            System.out.println("str6 과 str8은 같다");
        }else {
            System.out.println("str6 과 str8은 같지 않다");
        }

        if(str6.equals(str7)){
            System.out.println("str6 과 str7의 값은 같다");
        }else {
            System.out.println("str6 과 str7의 값은 같지 않다");
        }

    }
}
