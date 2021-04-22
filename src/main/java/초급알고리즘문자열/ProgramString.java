package 초급알고리즘문자열;

import java.util.Scanner;
/**
 * 7. 초급 알고리즘: 문자열을 입력받고, 반복되지 않은 가장 긴 문자열을 찾아 해당 길이와 해당 문자열을 출력하는 프로그램
 *      예1) 입력: abbcdb 출력: 3 (bcd)      예2) 입력: AbAfgG 출력: 5 (bAfgG)
 */
public class ProgramString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 같은 문자가 반복되지 않고 연속되는 가장 긴 문자열의 길이와 해당 문자열을 출력합니다.");
        System.out.println("(space 또는 tab 키 입력 직전까지의 문자열만 검사)");
        System.out.print(">>");
        String input = scan.next();
        String[] str = new String[input.length()];
        //문자열 중복 검사하여 같은 문자가 중복되지 않고 연속되는 문자열 각각을 str 배열에 저장
        iAdd:
        for (int i = 0; i < input.length(); i++){
            for (int k = i+1; k < input.length(); k++){
                for(int p = i; p < k; p++){

                    if (input.charAt(p) == input.charAt(k)) {
                        str[i] = input.substring(i, k); //인덱스 i부터 k-1까지의 문자열 저장
                        continue iAdd;
                    }

                }
                if (k == input.length()-1) str[i] = input.substring(i); //인덱스 i부터인 문자열의 끝까지 중복이 없음
            }//k
            if (i == input.length()-1) str[i] = input.substring(i); //마지막 인덱스 문자
        }//i
        //str 배열에서 가장 긴 문자열의 길이와 그 인덱스를 추출
        int max = str[0].length();
        int maxIndex = 0;
        for (int i = 0; i < str.length; i++){
            if (max < str[i].length()) {
                max = str[i].length();
                maxIndex = i;
            }
        }
        //출력
        System.out.println(max);
        System.out.println(str[maxIndex]);

    }
}