package calendar;

import java.util.Scanner;

//2021.01.22
public class Num {
    public static void main(String[] args) {

        System.out.println("두 수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = a + b;

        System.out.println("두 수의 합은 " + num + "입니다.");
        //System.out.println("%d와 %의 합은 %d입니다.",a,b, a + b); 대체 가능
        scanner.close(); //해주는편이 좋다~
        //옆에 노란색(워닝?)은 가급적 없애주자 있으면 실행되더라도 좋지 않다~
    }

}
