package 기초별찍기C;

import java.util.Scanner;

/**
 * 2. 기초 별찍기 c. 숫자를 입력받고, 해당 숫자의 크기의 마름모를 출력하는 프로그램을 만들어주세요.
 *    (숫자 크기를 마름모의 전체 라인 개수로 설정했음)
 */
public class ProgramC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        Verification vrfc = new Verification();

        do {
            System.out.println("3이상의 정수를 입력해주세요.");
            System.out.println("입력값이 마름모의 전체 라인 개수 입니다. 3이상의 짝수인 경우 1을 더해 홀수로 바꿔 마름모를 만듭니다.");
            System.out.print(">> ");
            input = scan.next();
        } while (!vrfc.isValid(input));

        int inputNumber = Integer.parseInt(input);

        //입력값이 짝수면 1을 더한 홀수로 바꿔서 그 값을 마름모의 전체 라인 개수로 계산
        int n = (inputNumber%2 == 0) ? inputNumber+1 : inputNumber;

        //마름모의 윗 부분. 마름모의 라인 1 ~ (n+1)/2 까지의 삼각형
        for (int i = 0; i < (n+1)/2; i++){
            for (int j = 0; j < ((n+1)/2)-1 + (i*(-1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + (i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //마름모의 아랫 부분. 윗 부분 제외한 역삼각형
        for (int i = 0; i < (n - (n+1)/2); i++){
            for(int j = 0; j < 1 + (i*1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*(n - (n+1)/2) - 1) + (i*(-2)); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// 입력값이 3이상의 정수인지 검증
class Verification {

    boolean isValid (String a){
        for (int i = 0; i < a.length(); i++){
            char tmp = a.charAt(i);
            if(!('0' <= tmp && tmp <= '9')){
                //숫자가 아닐 경우
                if(a.charAt(0) == '-') continue;
                System.out.println("잘못 입력하셨습니다. "+a+"은(는) 정수가 아닙니다.");
                return false;
            }
        }
        if (Integer.parseInt(a) < 3) {
            System.out.println("잘못 입력하셨습니다. "+a+"은(는) 3보다 작은 정수입니다.");
            return false;
        }
        return true;
    }

}