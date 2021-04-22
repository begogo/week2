package 초급알고리즘문자열;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 7. 초급 알고리즘: 문자열을 입력받고, 반복되지 않은 가장 긴 문자열을 찾아 해당 길이와 해당 문자열을 출력하는 프로그램
 *      예1) 입력: abbcdb 출력: 3 (bcd)      예2) 입력: AbAfgG 출력: 5 (bAfgG)
 */
public class ProgramString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        System.out.print(">>");
        String input = scan.next();
        String[] str = new String[input.length()];

        iAdd:
        for (int i = 0; i < input.length(); i++){
            for (int k = i+1; k < input.length(); k++){
                for(int p = i; p < k; p++){

                    if (input.charAt(p) == input.charAt(k)) {
                        str[i] = input.substring(i, k);
                        continue iAdd;
                    }

                }
                if (k == input.length()-1) str[i] = input.substring(i);
            }//k
            if (i == input.length()-1) str[i] = input.substring(i);
        }//i


    }
}