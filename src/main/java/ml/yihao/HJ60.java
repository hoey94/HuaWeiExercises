package ml.yihao;

import java.util.*;

/**
 * 题目描述
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
 * 本题含有多组样例输入。
 * 输入描述:
 * 输入一个偶数
 *
 * 输出描述:
 * 输出两个素数
 */
public class HJ60 {

    public HJ60() {
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int count(int n) {
        int i = n/2, j = n - i;
        while (!isPrime(i) || !isPrime(j)) {
            i++;
            j--;
        }
        return j;
    }

    public static void main(String[] args) {
        HJ60 solution = new HJ60();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = Integer.parseInt(in.next());
            int res = solution.count(n);
            System.out.println(res);
            System.out.println(n - res);
        }
    } 
}