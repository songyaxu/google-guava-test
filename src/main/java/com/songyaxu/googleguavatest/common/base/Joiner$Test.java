package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 19-8-15 下午4:00
 * @MOdified by:
 **/
public class Joiner$Test {

    static final List<String> LIST = Lists.newArrayList("1","2",null,"3");

    public static void main(String[] args) {
        System.out.println(joiner1());
        System.out.println(joiner2());
        System.out.println(joiner3());
        System.out.println(joiner4());
        System.out.println(joiner5());
    }

    static String joiner1(){
        return Joiner.on("&").withKeyValueSeparator("=").join(ImmutableMap.of("id", "123", "name", "green"));
    }

    static String joiner2(){
        return Joiner.on("#").skipNulls().join(LIST);
    }

    static String joiner3(){
        return Joiner.on('#').join(12,34,56,78,90);
    }

    static String joiner4(){
        return Joiner.on('#').useForNull("空").join(LIST);
    }

    static String joiner5(){
        return Joiner.on("$").appendTo(new StringBuilder("sss"),"xxx","yyy","zzz").toString();
    }
}
