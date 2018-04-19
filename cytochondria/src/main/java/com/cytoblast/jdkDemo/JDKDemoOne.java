package com.cytoblast.jdkDemo;

/**
 * Created on 2018/4/19.
 */
public class JDKDemoOne {


    public static void main(String[] args) {
        //trim
        String strOne = "                    ";
        String strTwo = "aaaaaaaaaaaaaaaaaaa    ";
        String strThree = "     bbbbbbbbbbbbbbbbbbb      ";
        String s = imitateStringTrimFunction(strOne);
        String s1 = imitateStringTrimFunction(strTwo);
        String s2 = imitateStringTrimFunction(strThree);
        System.out.println( s  + "=====================" + s1 + "=================" + s2);
    }



    // 实现String类的trim()方法功能
    /**
     * imitate 模仿
     * @param str
     * @return
     */
    private static String imitateStringTrimFunction(String str){
        if (str != null) {
            char[] chars = str.toCharArray();
            int p = 0;
            int len = chars.length;

            while (p < len) {
                if (' ' == chars[p]) {
                    p += 1;
                } else {
                    break;
                }
            }

            if (p == len) {
                return " ";
            }
            //从尾部到首部进行遍历，如果发现了第一个不是  ' ' 就break:表示终止了遍历，找到了尾部到首部第一个不为 ' ' 的位置
            int q = len - 1;
            while (q >= 0) {
                if (chars[q] == ' ') {
                    q -= 1;
                } else {
                    break;
                }
            }

            String subStr = str.substring(p, q + 1);
            return subStr;
        }
        return "null异常";
    }
}
