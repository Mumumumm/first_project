package accessModifier;

public class AccessModifier01 {
    public static void main(String[]args){
        // Dog 클래스
        Dog obj = new Dog();

        // 멤버 변수
        obj.breed = "치와와";
        obj.color = "갈색";
        System.out.println("강아지의 품종 : " + obj.breed);
        System.out.println("강아지의 색상 : " + obj.color);

        // public void sound
        obj.sound();

        // 같은 패키지의 protected int age 멤버 변수
        obj.age = 10;
        System.out.println("강아지의 나이 : " + obj.age);
        // 같은 패키지의 protected void run 생성자
        obj.run();

        // private 오류 결과
        // 'name' has private access in 'accessModifier.Dog' 같은 패키지에 private 된 name 멤버변수
        // 같은 클래스안에 있어야함
        /*
         * obj.name = "다운";
         * System.out.println("강아지의 이름 : " + obj.name);
         */

        // 같은 패키지에 private 된 sleep 생성자
        /*
         * obj.sleep();
         */
    }
}
