package Sodoku;

import java.util.Random;
/**
 * Q6. 숫자를 입력받고 (입력숫자 * 입력숫자)의 스도쿠판 출력. 규칙은 가로, 세로, 각 꼭지점의 대각선. 항상 랜덤한 판이 나오도록
 * 스도쿠판에 출력되는 숫자 범위는 1~9로 설정
 */
public class ProgramSudoku {

    public static void main(String[] args) {
        int size = 9; //9*9크기로 테스트

        int[][] result = new int[size][size];

        Random rand = new Random();

        for (int i=0; i<size; i++){
            for(int k=0; k<size; k++){

                check: while(true){
                    result[i][k] = rand.nextInt(9)+1;

                    //가로줄 검사
                    for (int col = k-1; col >= 0; col--) {
                        if (result[i][k] == result[i][col]) {
                            continue check;
                        }
                    }
                    //세로줄 검사
                    for (int row = i-1; row >= 0; row--) {
                        if (result[i][k] == result[row][k]) {
                            continue check;
                        }
                    }
                    break;
//                  //대각선 검사
//                    if (i == k){
//                        for (int diag = i-1; diag >= 0; diag--){
//                            if (result[i][k] == result[diag][diag]){
//                                continue check;
//                            }
//                        }
//                    }

                }

            }
        }

        //스도쿠판 출력
        for (int i=0; i<size; i++){
            for (int k=0; k<size; k++){
                System.out.print(result[i][k]+" ");
            }
            System.out.println();
        }


    }

}

