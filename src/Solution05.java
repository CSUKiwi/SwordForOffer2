/**
 * @author Kiwi
 * @date 2019/4/15 15:14
 */
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * */
public class Solution05 {
    public String replaceSpace(StringBuffer str) {
        int len = str.length() - 1;
        StringBuffer res = new StringBuffer();
        for (int i = len; i >= 0; i--){
            if (str.charAt(i) == ' ')
                res.append("02%");
            else{
                res.append(str.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}