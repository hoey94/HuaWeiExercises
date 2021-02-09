package ml.yihao;

import java.util.Scanner;

/**
 * @author zyh
 * @Description:
 * @date 2021/2/910:42 上午
 * 题目描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 *
 * 输入描述:
 * 输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，请参考帖子https://www.nowcoder.com/discuss/276处理多组输入的问题。
 *
 * 输出描述:
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 */
public class No5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            // 去掉前两位
            System.out.println(Integer.valueOf(str.substring(2),16).toString());
        }

    }
}
