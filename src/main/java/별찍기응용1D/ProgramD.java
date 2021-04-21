package 별찍기응용1D;

import java.util.Scanner;

/**
 * 3. 별찍기 응용 1 - d. 숫자를 입력받고, 해당 숫자의 크기의 육망성을 출력하는 프로그램
 */
public class ProgramD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        Verification vrfc = new Verification();

        do {
            System.out.println("2이상의 정수를 입력해주세요.");
            System.out.print(">> ");
            input = scan.next();
        } while (!vrfc.isValid(input));

        int n = Integer.parseInt(input);

        int trianglePart1 = n;
        int trianglePart2 = n;
        int trianglePart3 = n-1;
        int trianglePart4 = n;

        //파트1
        for (int i = 0; i < trianglePart1; i++){
            for (int j = 0; j < (2*n-1) + (n-1) + (i*(-1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + (i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //파트2
        for (int i = 0; i < trianglePart2; i++){
            for(int j = 0; j < 0 + (i*1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*n-1)*3 + (i*(-2)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //파트3
        for (int i = 0; i < trianglePart3; i++){
            for (int j = 0; j < (n-1)-1 + (i*(-1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*(2*n+1)-1) + (i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //파트4
        for (int i = 0; i < trianglePart4; i++){
            for (int j = 0; j < (2*n-1) + (i*(+1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*n-1) + (i*(-2)); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

class Verification {
    boolean isValid(String a) {
        for (int i = 0; i < a.length(); i++) {
            char tmp = a.charAt(i);
            if (!('0' <= tmp && tmp <= '9')) {
                //숫자가 아닐 경우
                if (a.charAt(0) == '-') continue;
                System.out.println("잘못 입력하셨습니다. " + a + "은(는) 정수가 아닙니다.");
                return false;
            }
        }
        if (Integer.parseInt(a) < 2) {
            System.out.println("잘못 입력하셨습니다. " + a + "은(는) 2보다 작은 정수입니다.");
            return false;
        }
        return true;
    }
}