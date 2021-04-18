
public class test {
    public static void main(String[] args) {

    int n = 10;
    //일반항 a1 + (n-1)*d 형태를 살리는 형태로 입력
    for (int i = 0; i < n; i++){
        for(int j = 0; j < 0 + i*1; j++){
            System.out.print(" ");
        }
        for(int j = 0; j < (2*n-1)-(i*2); j++){
            System.out.print("*");
        }
        System.out.println();
    }


    }
}
