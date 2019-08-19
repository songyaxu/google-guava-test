package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.Objects;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/19 下午3:42
 * @MOdified by:
 **/
public class Objects$Test {

    public static void main(String[] args) {
        Integer a = new Integer("1");
        Integer b = 1;
        Integer c = Integer.valueOf(1);
        System.out.println("normal ------------------- test");
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        System.out.println("-------------------------------");
        System.out.println(Objects.equal(a,b));
        System.out.println(Objects.equal(b,c));
        System.out.println(Objects.equal(a,c));
        System.out.println("-------------------------------");
        System.out.println(Objects.hashCode(a));
        System.out.println(Objects.hashCode(b));
        System.out.println(Objects.hashCode(c));
    }

}
