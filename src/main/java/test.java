public class test {
    public static void main(String[] args) {

//        char a = '1';
//        char b = 1;
//        char c = 65;
//        char d = 0x0041;
//        char e = 'A';
//        int f = 'A';
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);

//        for (int i = 0; i < 10; i++){
//            i++;
//            System.out.println(i);
//        }
                      //01234567
        String input = "abcdefgh";
        String[] str = new String[input.length()];

        i증가:
        for (int i = 0; i < input.length(); i++){
            for (int k = i+1; k < input.length(); k++){
                for(int p = i; p < k; p++){

                    if (input.charAt(p) == input.charAt(k)) {
                        str[i] = input.substring(i, k);
                        continue i증가;
                    }

                }
                if (k == input.length()-1) str[i] = input.substring(i);
            }//k
            if (i == input.length()-1) str[i] = input.substring(i);
        }//i


    }
}

//class Check {
//    void run(String input, int i){
//        int index = input.substring(i+1).indexOf(input.charAt(i));
//        if (index != -1){
//            for (int k = i+1; k < input.substring(i, index+1).length(); k++){
//
//            }
//            System.out.println(input.substring(i, index+1));
//        }
//
//    }
//}

//        for (int i = 0; i < input.length(); i++){
//        for (int k = i+1; k < input.length(); k++){
//
//
//        if (input.charAt(i) == input.charAt(k)) {
//        for (int ch = i, n = 0 ; ch < k ; ch++, n++){
//        memory[i][n] = String.valueOf(input.charAt(ch));
//        }
//        }
////                int tmp = i;
////                tmp++;
////                if (tmp == k)
//        }
//        }
//
//        int[] size = new int[input.length()];
//        for (int i = 0; i < input.length(); i++){
//        size[i] = memory[i].length;
//        }
//        int max = size[0];
//        for (int i = 0; i < input.length(); i++){
//        if (max < size[i]){
//        max = size[i];
//        }
//        }
//
//        System.out.print("반복되지 않은 가장 긴 문자열의 길이: "+memory[max].length+" (");
//        for (int i = 0; i < memory[max].length; i++){
//        System.out.print(memory[max][i]);
//        }
//        System.out.print(")");
