package com.geeks.ds;

public class AddTwoStringNumberTest {

    private static int BASE = 10;

//    public static String addStrings(String num1, String num2) {
//        int len = Math.max(num1.length(), num2.length());
//        char[] arr = new char[len + 1];
//
//        int p1 = num1.length() - 1;
//        int p2 = num2.length() - 1;
//
//        int carry = 0;
//
//        for (int i = len; i > 0; i--) {
//            int n1 = 0;
//            int n2 = 0;
//
//            if (p1 >= 0) {
//                n1 = num1.charAt(p1) - '0';
//            }
//
//            if (p2 >= 0) {
//                n2 = num2.charAt(p2) - '0';
//            }
//
//            int sum = n1 + n2 + carry;
//            if (sum > 9) {
//                carry = 1;
//                sum -= 10;
//            } else carry = 0;
//
//            arr[i] = (char) (sum + '0');
//
//            p1--;
//            p2--;
//        }
//
//        if (carry > 0) {
//            arr[0] = '1';
//            return new String(arr);
//        } else {
//            return new String(arr, 1, arr.length + 1);
//        }
//    }




    public static String add(String addend1, String addend2) {
        StringBuilder buf = new StringBuilder();
        for ( int i1 = addend1.length() - 1, i2 = addend2.length() - 1, carry = 0;
              i1 >= 0 || i2 >= 0 || carry != 0;
              i1--, i2-- ) {
            int digit1 = i1 < 0 ? 0 :
                    Integer.parseInt(Character.toString(addend1.charAt(i1)));
            int digit2 = i2 < 0 ? 0 :
                    Integer.parseInt(Character.toString(addend2.charAt(i2)));

            int digit = digit1 + digit2 + carry;
            if (digit > 9) {
                carry = 1;
                digit -= 10;
            } else {
                carry = 0;
            }

            buf.append(digit);
        }
        return buf.reverse().toString();
    }



    public static void main(String[] args) {
        System.out.println(add("3.14","0.9"));
    }
}
