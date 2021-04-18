import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 1. 기초 알고리즘 b. 두 개의 숫자를 입력받고, n~m 까지의 연속된 수의 합을 구하는 프로그램
 */
public class ProgramB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputN;
        String inputM;
        Verification vrfc = new Verification();

        do {
            System.out.println("정수 값을 입력해주세요.");
            inputN = scan.next();
        } while (vrfc.isString(inputN));
        do {
            System.out.println("정수 값을 입력해주세요.");
            inputM = scan.next();
        } while (vrfc.isString(inputM));

        long n, m;
        // 입력받은 수 중 작은 수를 n, 큰 수를 m으로
        if (Long.parseLong(inputN) <= Long.parseLong(inputM)) {
            n = Long.parseLong(inputN);
            m = Long.parseLong(inputM);
        } else {
            n = Long.parseLong(inputM);
            m = Long.parseLong(inputN);
        }

        long sum = 0;
        for (long i = n; i <= m; i++){
            sum += i;
        }
        DecimalFormat fmt = new DecimalFormat("###,###");
        System.out.println(fmt.format(n)+"~"+fmt.format(m)+"까지 연속되는 정수의 합: "+fmt.format(sum));
    }
}

// 입력값이 정수인지 검증
class Verification {

    boolean isString (String a){
        for (int i = 0; i < a.length(); i++){
            char tmp = a.charAt(i);
            if(!('0' <= tmp && tmp <= '9')){
                //숫자가 아닐 경우
                if(a.charAt(0) == '-') continue;
                System.out.println("잘못 입력하셨습니다. "+a+"은(는) 정수가 아닙니다.");
                return true;
            }
        }
    return false;
    }

}
