/**
 * @author Kiwi
 * @date 2019/4/22 12:22
 */
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39，
 * */
public class Solution10 {
    public int Fibonacci(int n) {
        if (n == 0 | n == 1)
            return n;
        int fn0 = 0;
        int fn1 = 1;
        int fn = 0;
        for (int i = 2;i <= n; i++){
            fn = fn0 + fn1;
            fn0 = fn1;
            fn1 = fn;
        }
        return fn;
    }
}
