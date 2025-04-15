package classpackag;

public class Example04 {
    public static void main(String[]args){
        Cat cat1 = new Cat();
        cat1.breed = "고양이";
        System.out.println("cat1 : " + cat1.breed);
        System.out.println(); // 줄바꿈용

        Cat cat2 = new Cat("고먐미");
        System.out.println("cat2 Breed : " + cat2.breed);
        System.out.println(); // 줄바꿈용

        Cat cat3 = new Cat("고샷시","삼색");
        System.out.println("cat3 Breed : " + cat3.breed + "\ncat3 Color : " + cat3.color);
        System.out.println(); // 줄바꿈용

    }
}
