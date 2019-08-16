package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.AbstractList;
import java.util.List;
import java.util.Map;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/15 下午5:22
 * @MOdified by:
 **/
public class Optional$Test {

    private static final Map<String,String> MAP = ImmutableMap.of("1","sss","2","zzz");
    private static final List<Optional<String>> stringList = Lists.newArrayList(Optional.fromNullable(null),Optional.of("ss"),Optional.of("zzz"));
    private static final java.util.Optional<String> str = java.util.Optional.of("sss");

    public static void main(String[] args) {
        System.out.println(optional1().isPresent());
        System.out.println(optional2().get());
        System.out.println(optional3().get());
        System.out.println("---------------------------------");
        optional4().forEach(System.out::println);
        System.out.println("---------------------------------");
        System.out.println(optional5().get());
        System.out.println(optional6().get());
    }

    private static Optional<String> optional1(){
        return Optional.absent();
    }

    private static Optional<String> optional2(){
        return Optional.of(MAP.get("1"));
    }

    private static Optional<String> optional3(){
        return Optional.fromNullable("sss");
    }

    private static Iterable<String> optional4(){
        return Optional.presentInstances(stringList);
    }

    private static Optional<String> optional5(){
        return Optional.fromJavaUtil(str);
    }

    private static java.util.Optional<String> optional6(){
        return Optional.toJavaUtil(Optional.of("dsds"));
    }
}
