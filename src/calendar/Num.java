package calendar;

import java.util.Scanner;
//
//2021.01.22
public class Num {
    public static void main(String[] args) {

        System.out.println("두 수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = a + b;

        System.out.println("두 수의 합은 " + num + "입니다.");
    }

}
