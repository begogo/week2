package Sudoku;

import java.util.Random;
import java.util.Scanner;
/**
 * Q6. 숫자를 입력받고 (입력숫자 * 입력숫자)의 스도쿠판 출력. 규칙은 가로, 세로, 각 꼭지점의 대각선. 항상 랜덤한 판이 나오도록.
 * 스도쿠판에 출력되는 숫자 범위는 1~9로 설정
 */
public class ProgramSudoku {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("스도쿠 퍼즐의 크기를 설정해주세요. (범위: 2~9)");
            System.out.print(">>");
            input = scan.next();
            if (input.length() > 1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            char tmp = input.charAt(0);
            if ('2' <= tmp && tmp <= '9') {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        int size = Integer.parseInt(input);
        int[][] number = new int[size][size];
        Random rand = new Random();
        long start = System.currentTimeMillis();

        LoadingThread t1 = new LoadingThread(".");

        System.out.print(size+"*"+size+" 스도쿠 퍼즐 생성중..");
        t1.start();

        reset:
        while (true) {

            int loopCount = 0;

            for (int i = 0; i < size; i++) {
                for (int k = 0; k < size; k++) {

                    check:
                    while (true) {
                        number[i][k] = rand.nextInt(9) + 1;
                        //가로줄 검사
                        for (int col = k - 1; col >= 0; col--) {
                            if (number[i][k] == number[i][col]) {
                                loopCount++;
                                if (loopCount > 1000) continue reset;
                                continue check;
                            }
                        }
                        //세로줄 검사
                        for (int row = i - 1; row >= 0; row--) {
                            if (number[i][k] == number[row][k]) {
                                loopCount++;
                                if (loopCount > 1000) continue reset;
                                continue check;
                            }
                        }
                        //꼭지점 좌상~우하 대각선 검사
                        if (i == k) {
                            for (int diag = i - 1; diag >= 0; diag--) {
                                if (number[i][k] == number[diag][diag]) {
                                    loopCount++;
                                    if (loopCount > 1000) continue reset;
                                    continue check;
                                }
                            }
                        }
                        //꼭지점 우상~좌하 대각선 검사
                        if (i + k == size - 1) {
                            for (int diagI = i - 1, diagK = k + 1; diagI >= 0 && diagK <= 8; diagI--, diagK++) {
                                if (number[i][k] == number[diagI][diagK]) {
                                    loopCount++;
                                    if (loopCount > 1000) continue reset;
                                    continue check;
                                }
                            }
                        }
                        break;

                    }//while check

                }//k
            }//i
            break;
        }//while reset

        t1.setLoadingThread(true);
        System.out.println();

        //스도쿠판 출력
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (k == size-1) {
                    System.out.print(number[i][k]);
                } else {
                    System.out.print(number[i][k] + "  ");
                }
            }
            System.out.println();
        }
        long end = System.currentTimeMillis();
        System.out.println("퍼즐 생성 소요시간: " + (end - start)/1000.0 + "초");

    }
}
