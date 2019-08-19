package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.MoreObjects;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/19 下午3:29
 * @MOdified by:
 **/
public class MoreObjects$Test {
    public static void main(String[] args) {
        System.out.println(moreObjects1());
        System.out.println(moreObjects2());
        System.out.println(moreObjects3());
        System.out.println(moreObjects4());
        System.out.println(moreObjects5());
        System.out.println(moreObjects6());
    }

    private static String moreObjects1(){
        return MoreObjects.firstNonNull(null,"ss");
    }

    private static String moreObjects2(){
        try {
            return MoreObjects.firstNonNull(null, null);
        }catch (NullPointerException npe){
            //System.out.println(npe);
            return "both null";
        }
    }

    private static String moreObjects3(){
        return MoreObjects.firstNonNull("tt",null);
    }

    private static String moreObjects4(){
        return MoreObjects.toStringHelper(Integer.class).add("sss",false).toString();
    }

    private static String moreObjects5(){
        Object object = new Object();
        object = "abcd";
        return MoreObjects.toStringHelper(object).toString();
    }

    private static String moreObjects6(){
        Object object = new Object();
        return MoreObjects.toStringHelper(object).add("name","songyaxu").add("age","25").toString();
    }
}
