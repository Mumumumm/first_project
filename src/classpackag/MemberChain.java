package classpackag;

public class MemberChain {
    String firstName;
    String country;
    int age;

    public MemberChain(){
        this("김준홍");
    }
    public MemberChain(String mName){
        this(mName,27);
    }
    public MemberChain(String mName, int mAge){
        this(mName, mAge,"대한민국");
    }
    public MemberChain(String mName, int mAge, String mCountry){
        firstName = mName;
        country = mCountry;
        age = mAge;
    }

    void printInfo(){
        System.out.println("이름 : " + firstName);
        System.out.println("국적 : " + country);
        System.out.println("나이 : " + age);
    }
}
