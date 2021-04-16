import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 1. 기초 알고리즘 a. 한 개의 숫자를 입력받고, 1~n 까지의 연속된 수의 합을 구하는 프로그램
 */
public class ProgramA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = null;
        boolean isDigit = false;

        while (!isDigit){
            System.out.println("1-a. 양의 정수 n 값을 입력해주세요.");
            input = scan.next();

            // 입력값이 양의 정수인지 검증
            for (int i = 0; i < input.length(); i++){
                if(!(Character.isDigit(input.charAt(i)))){
                    System.out.println("잘못 입력하셨습니다.");
                    isDigit = false;
                    break;
                } else {
                    isDigit = true;
                }
            }
            if (input.equals("0")){
                System.out.println("잘못 입력하셨습니다.");
                isDigit = false;
            }
        }

        long num;
        num = Long.parseLong(input);

        long sum = 0;
        for (long i = 1; i <= num; i++){
            sum += i;
        }
//        sum = num*(num+1)/2; //등차수열 합 이용

        DecimalFormat fmt = new DecimalFormat("###,###");
        System.out.println("1 ~ "+fmt.format(num)+"까지 연속되는 정수의 합: "+fmt.format(sum));

    }
}
