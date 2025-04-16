package accessModifier;

public class Dog {
    public String breed;
    public String color;
    protected int age;
    private String name;

    public void sound(){
        System.out.println("강아지가 짖다");
    }
    protected void run(){
        System.out.println("강아지가 달리다");
    }
    private void sleep(){
        System.out.println("강아지가 잠을 잔다");
    }


}
