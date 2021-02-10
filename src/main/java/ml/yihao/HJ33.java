package ml.yihao;

import java.util.*;

/**
 *
 题目描述
 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
 一个长整数。
 举例：一个ip地址为10.0.3.193
 每段数字             相对应的二进制数
 10                   00001010
 0                    00000000
 3                    00000011
 193                  11000001

 组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。

 本题含有多组输入用例，每组用例需要你将一个ip地址转换为整数、将一个整数转换为ip地址。



 输入描述:
 输入
 1 输入IP地址
 2 输入10进制型的IP地址

 输出描述:
 输出
 1 输出转换成10进制的IP地址
 2 输出转换后的IP地址
 */
public class HJ33 {
 
    private final int N = 4;
    public HJ33() {
    }
 
    public String convert(String str) {
        // ipv4 -> int
        if (str.contains(".")) {
            String[] fields = str.split("\\.");
            long result = 0;
            for (int i = 0; i < N; i++) {
                result = result * 256 + Integer.parseInt(fields[i]);
            }
            return "" + result;
        }
        // int -> ipv4
        else {
            long ipv4 = Long.parseLong(str);
            String result = "";
            for (int i = 0; i < N; i++) {
                result = ipv4 % 256 + "." + result;
                ipv4 /= 256;
            }
            return result.substring(0, result.length() - 1);
        }
    }
 
    public static void main(String[] args) {
        HJ33 solution = new HJ33();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            String res = solution.convert(str);
            System.out.println(res);
        }
    }
}
