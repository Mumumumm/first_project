package classpackag;

public class StudentMain {
    public static void main(String[]args){
        // 같은 Student 클래스로 만들었지만 서로 다른 클래스 stObject1 과 stObject2


        Student stObject1 = new Student();
        stObject1.id = 19990419;
        stObject1.name = "김준홍";
        stObject1.parmInfo();

        // insertRecord 메서드 매개변수를 입력하고 parmInfo로 출력
        Student stObject2 = new Student(); // Student 타입의 new Student 객체를 생성 stObject2 대입
        stObject2.insertRecord(20250415,"김준홍");
        stObject2.parmInfo(); // Student 클래스 안에 있는 parmInfo로 출력

        System.out.println("****학생 주소록****");
        Student stObject3 = new Student();
        stObject3.insertRecord(990419,"준홍씌");
        stObject3.parmInfo();

        Student stObject5 = new Student(990419,"주농씌");
        stObject5.parmInfo();

    }
}
