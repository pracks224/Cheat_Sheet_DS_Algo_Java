package String_dsa;

/*
Given two binary strings A and B. Return their sum (also a binary string).
A = "100"
B = "11"
Then Output would be  111
 */
public class AddBinary {
    public static void main(String[] args) {
        String A = "101";
        String B = "11";
        System.out.println(addBinary(A, B));
    }

    public static String addBinary(String A, String B) {
        //  int temp ='B';
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int max_len = Math.max(A.length(), B.length());
        for (int i = 0; i < max_len; i++) {
            int num1 = (i < A.length()) ? A.charAt(A.length()-i - 1) - '0' : 0;
            int num2 = (i < B.length()) ? B.charAt(B.length()-i - 1) - '0' : 0;
            int tmp = num1 + num2 + carry;
            carry = tmp / 2;
            result.append(tmp%2);
        }
     //   return result.toString();
        return (carry == 0) ? result.toString() :result.append(carry).reverse().toString();
        //The above commented section not optmised way of doing it.Best Approach would be

       /* int num1 = Integer.parseInt(A,2);
        int num2 = Integer.parseInt(B,2);
        int sum = num1+num2;
        return Integer.toBinaryString(sum);*/
    }
}
