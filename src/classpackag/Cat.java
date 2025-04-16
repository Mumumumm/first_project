package classpackag;

public class Cat {
    String breed;
    String color;
    int age =10;

    Cat(){
        System.out.println("Cat() 생성자를 호출");
    }
    Cat(String pBreed){
        System.out.println("Cat(...) 생성자를 호출");
        this.breed = pBreed;
    }
    Cat(String pBreed, String pColor, int pAge){
        System.out.println("Cat(..., ...) 생성자 호출");
        this.breed = pBreed;
        this.color = pColor;
        this.age = pAge;
    }

    void eat(){
        System.out.println("Eat");
    }
    void scratch(){
        System.out.println("Scratch");
    }
    void sound(){
        System.out.println("Sound");
    }
}
