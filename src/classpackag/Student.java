package classpackag;

public class Student {
    // 자료형과 변수만 만들어놓은 상태
    int id;
    String name;

    Student(){
        System.out.println("Student() 생성자 호출");
    }
    Student(int parm1, String parm2){
        System.out.println("Student(...) 생성자 호출");
        this.id = parm1;
        this.name = parm2;
    }

    // 매개변수
    void insertRecord(int parm1, String parm2){
        // this 를 사용해 int id; String name; 가리킴
        this.id = parm1; // 매개변수에 들어간 내용을 id로
        this.name = parm2;
    }

    void parmInfo(){
        System.out.println("아이디 : " + id); // 여기에서 출력이 된다
        System.out.println("이름  : " + name);
    }
}
