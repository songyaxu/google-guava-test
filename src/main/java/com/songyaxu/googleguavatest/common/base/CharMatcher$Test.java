package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.CharMatcher;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/16 下午3:43
 * @MOdified by:
 **/
public class CharMatcher$Test {

    private static final CharMatcher CHAR_MATCHER = CharMatcher.anyOf("#");

    public static void main(String[] args) {
        System.out.println(charMatcher1());
        System.out.println(charMatcher2());
        System.out.println(charMatcher3());
        System.out.println(charMatcher4());
        System.out.println(charMatcher5());
        System.out.println(charMatcher6());
        System.out.println(charMatcher7());
        System.out.println(charMatcher8());
        System.out.println(charMatcher9());
    }

    private static String charMatcher1(){
        return CHAR_MATCHER.collapseFrom("as#az,#a",'$');
    }

    private static String charMatcher2(){
        return CHAR_MATCHER.removeFrom("ADAD#DASQWE#21");
    }

    private static String charMatcher3(){
        return CHAR_MATCHER.retainFrom("sds#121");
    }

    private static String charMatcher4(){
        return CharMatcher.is('a').trimFrom("asasa");
    }

    private static String charMatcher5(){
        return CharMatcher.inRange('a','d').collapseFrom("adAas$ds$,wq",'$');
    }

    private static String charMatcher6(){
        return CharMatcher.any().collapseFrom("ss#2",'$');
    }

    private static String charMatcher7(){
        return CharMatcher.whitespace().collapseFrom("ssssada dada", ' ');
    }

    private static String charMatcher8(){
        return CharMatcher.anyOf("zke").collapseFrom("zkeeper",'-');
    }

    private static String charMatcher9(){
        return CharMatcher.isNot('z').trimLeadingFrom("dsdszds");
    }
}
