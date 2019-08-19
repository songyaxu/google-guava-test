package com.songyaxu.googleguavatest.common.base;

import com.google.common.base.Preconditions;

/**
 * @Author： yaxuSong
 * @Description：
 * @Date： 2019/8/19 下午3:49
 * @MOdified by:
 **/
public class Preconditions$Test {
    private static final Boolean ARGUMENT_FALSE = Boolean.FALSE;
    private static final Boolean ARGUMENT_TRUE = Boolean.TRUE;

    public static void main(String[] args){
        preconditions1();
        preconditions2();
        preconditions3();
        preconditions4();
        preconditions5();
        preconditions6();
        preconditions7();
        preconditions8();
        preconditions9();
        preconditions10();
        preconditions11();
        preconditions12();
    }

    private static void preconditions1(){
        try {
            Preconditions.checkArgument(ARGUMENT_TRUE);
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions2(){
        try {
            Preconditions.checkArgument(ARGUMENT_FALSE);
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions3(){
        try {
            Preconditions.checkArgument(ARGUMENT_FALSE, "用户ID不存在");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions4(){
        try {
            Preconditions.checkArgument(ARGUMENT_FALSE, "%s不存在", "用户ID");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions5(){
        try {
            Preconditions.checkArgument(ARGUMENT_FALSE, "%s不存在,%s也不存在","用户ID","用户名称");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions6(){
        try {
            Preconditions.checkNotNull(null,"%s为空","用户id");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions7(){
        try {
            Preconditions.checkState(ARGUMENT_FALSE,"%s状态不正确","用户id");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions8(){
        try {
            Preconditions.checkElementIndex(3,3,"找不到index为"+3+"的元素");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions9(){
        try {
            Preconditions.checkElementIndex(3,2);
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions10(){
        try {
            Preconditions.checkPositionIndex(3,2,"not found");
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions11(){
        try {
            Preconditions.checkPositionIndex(3,2);
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }

    private static void preconditions12(){
        try {
            Preconditions.checkPositionIndexes(3,7,5);
        }catch (Exception eMsg){
            System.out.println(eMsg);
        }
    }
}
