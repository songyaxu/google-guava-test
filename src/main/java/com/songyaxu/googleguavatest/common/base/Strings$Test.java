package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.Strings;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 19-8-15 下午2:57
 * @MOdified by:
 **/
public class Strings$Test {

    public static final String a = "abc.jpg";
    public static final String b = "abc.png";
    public static final String c = "cba.gif";
    public static final String d = "d";
    public static final String NULL = null;

    public static void main(String[] args) {

        System.out.println(Strings.nullToEmpty(NULL));
        System.out.println(Strings.isNullOrEmpty(NULL));
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.emptyToNull(""));
        System.out.println(Strings.padStart(a,20,'z'));
        System.out.println(Strings.padEnd(a,20,'z'));
        //后边的对象替换%s,按照相同的顺序
        System.out.println(Strings.lenientFormat("2%s2%s2%s2","ds","zx","fg"));
        //相同前缀
        System.out.println(Strings.commonPrefix(a,b));
        //相同后缀
        System.out.println(Strings.commonSuffix(a,b));
        System.out.println(Strings.repeat(d,4));
    }


}
