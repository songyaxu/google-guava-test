package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.CaseFormat;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/16 下午3:21
 * @MOdified by:
 **/
public class CaseFormat$Test {

    private static final String LOWER_UNDERSCORE_STR = "case_format";
    private static final String LOWER_CAMEL_STR = "caseFormat";

    public static void main(String[] args) {
        System.out.println(caseFormat1());
        System.out.println(caseFormat2());
        System.out.println(caseFormat3());
        System.out.println(caseFormat4());
    }

    private static String caseFormat1(){
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,LOWER_UNDERSCORE_STR);
    }

    private static String caseFormat2(){
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL,LOWER_UNDERSCORE_STR);
    }

    private static String caseFormat3(){
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE,LOWER_CAMEL_STR);
    }

    private static String caseFormat4(){
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE,LOWER_CAMEL_STR);
    }
}
