package classpackag;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Example04 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        Cat cat1 = new Cat();
        cat1.breed = "고양이";
        System.out.println("cat1 : " + cat1.breed + "\ncat1 Age : " + cat1.hp);
        System.out.println(); // 줄바꿈용

        Cat cat2 = new Cat("고먐미");
        System.out.println("cat2 Breed : " + cat2.breed);
        System.out.println(); // 줄바꿈용




        Cat cat3 = new Cat("고샷시","삼색", 15 );
        System.out.println("cat3 Breed : " + cat3.breed + "\ncat3 Color : " + cat3.color + "\ncat3 Age : " +cat3.hp);
        System.out.println(); // 줄바꿈용

        Cat player = new Cat("나","자신",20);


        while (true){
            int chancePlayer = ThreadLocalRandom.current().nextInt(10);
            // 공격 또는 도망 입력 현재체력 바로표시
            System.out.println(); // 줄바꿈용
            System.out.println("공격 또는 도망");
            System.out.println("현재 고양이 체력 : " + cat3.hp + " 플레이어 체력 : " + player.hp);
            System.out.println("[플레이어 차례]");
            String atk = s.nextLine();

            if(atk.equals("공격")){
                if(chancePlayer < 7) {
                    System.out.println("공격 성공\n");
                    cat3.hp = cat3.hp - 1;
                }else {
                    System.out.println("고양이가 회피 했다\n");
                }
            }
            System.out.println("[고양이 차례]");
            int chanceCat = ThreadLocalRandom.current().nextInt(10);
            if(chanceCat < 3){
                player.hp--;
                System.out.println("긁혔다! 남은 체력 : " + player.hp +"\n");
            }else if(chanceCat > 3 && chanceCat < 9){
                System.out.println("고양이가 잠잠히 있다\n");
            }else if(chanceCat >= 9){
                System.out.println("고양이가 도망쳤다\n");
                break;
            }

            if (cat3.hp == 0){
                System.out.println("고양이를 잡았다");
                break;
            } else if (atk.equals("도망")) {
                System.out.println("고양이 한테서 도망쳤다");
                break;
            }
        }

    }
}
