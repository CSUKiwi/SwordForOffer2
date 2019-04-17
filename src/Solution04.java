/**
 * @author Kiwi
 * @date 2019/4/14 19:36
 */
/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * */
public class Solution04 {
    public boolean Find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0)
            return false;
        int m = 0;
        int n = array.length - 1;
        int temp = array[m][n];
        while(target != temp){
            if (m < array[0].length - 1 && n > 0){
                if (temp < target)
                    m++;
                if (temp > target)
                    n--;
                temp = array[m][n];
            }else{
                return false;
            }
        }
        return true;
    }
}