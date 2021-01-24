package calendar;

import java.util.Scanner;

public class prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        while (true) {
            System.out.println("달을 입력해주세요.");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            cal.printCalendar(2021, month);
        }
//        cal.printSampleCalendar();
        System.out.println("Bye!!");
        scanner.close();
    }

    public static void main(String[] args) {
        //셀 실행
        prompt p = new prompt();
        p.runPrompt();
    }
}
