package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.Defaults;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/19 下午3:07
 * @MOdified by:
 **/
public class Defaults$Test {

    public static void main(String[] args) {
        System.out.println(defaults(Integer.class));
        System.out.println(defaults(long.class));
        System.out.println(defaults(Double.class));
        System.out.println(defaults(Boolean.class));
        System.out.println(defaults(double.class));
    }

    private static <T> T defaults(Class<T> clazz){
        return Defaults.defaultValue(clazz);
    }
}
