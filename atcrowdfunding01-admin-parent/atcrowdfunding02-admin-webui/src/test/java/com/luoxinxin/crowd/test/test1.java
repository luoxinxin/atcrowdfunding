package com.luoxinxin.crowd.test;

import java.math.BigInteger;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-10-19
 * Modified By： luoxinxin
 */
public class test1 {
//    public static void main(String[] args) {
//        boolean a = false;
//        if(a==false){
//            System.out.println(a);
//        }
//    }

    public static void main(String[] args) {
        String a = "asdf1234";
        byte[] b = a.getBytes();
        System.out.println(b.toString());
        int signum = 1;
        BigInteger bigInteger = new BigInteger(signum,b);
        System.out.println(bigInteger);
    }
}
