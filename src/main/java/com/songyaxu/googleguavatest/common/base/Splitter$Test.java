package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/16 上午11:22
 * @MOdified by:
 **/
public class Splitter$Test {

    private static final Pattern PATTERN = Pattern.compile("[a-z]");
    private static final CharMatcher CHAR_MATCHER = CharMatcher.anyOf("$");

    public static void main(String[] args) {
        System.out.println("--------------------");
        splitter1().forEach(System.out::println);
        System.out.println("--------------------");
        splitter2().forEach(Splitter$Test::print);
        System.out.println("--------------------");
        splitter3().forEach(System.out::println);
        System.out.println("--------------------");
        splitter4().forEach(System.out::println);
        System.out.println("--------------------");
        splitter5().forEach(System.out::println);
        System.out.println("--------------------");
        splitter6().forEach(System.out::println);
        System.out.println("--------------------");
        splitter7().forEach(Splitter$Test::print);
        System.out.println("--------------------");
        splitter8().forEach(Splitter$Test::print);
        System.out.println("--------------------");
        splitter9().forEach(Splitter$Test::print);
    }

    private static Iterable<String> splitter1(){
        return Splitter.on("#").split("12#34#56");
    }

    private static Map<String,String> splitter2(){
        return Splitter.on("&").withKeyValueSeparator("=").split("name=songyaxu&id=123");
    }

    private static Iterable<String> splitter3(){
        return Splitter.fixedLength(6).split("2222,2,22");
    }

    /**
     *
     * @return [11 1, # .1., 11, ]
     */
    private static Iterable<String> splitter4(){
        return Splitter.fixedLength(6).trimResults().split("11 1   # .1.11          ");
    }

    private static List<String> splitter5(){
        return Splitter.fixedLength(3).splitToList("2222222222222222");
    }

    private static Iterable<String> splitter6(){
        return Splitter.on("#").limit(3).split("12#23#12121212#100000");
    }

    private static Iterable<String> splitter7(){
        return Splitter.on(PATTERN).omitEmptyStrings().trimResults().split("0102a dd4max6070kanpiaoxue314");
    }

    private static Iterable<String> splitter8(){
        return Splitter.on('#').omitEmptyStrings().split("2####21#1");
    }

    private static Iterable<String> splitter9(){
        return Splitter.on("#").trimResults(CHAR_MATCHER).split("34$#56$#2$2#");
    }

    private static void print(String... str){
        Arrays.asList(str).forEach(System.out::print);
        System.out.println();
    }
}
