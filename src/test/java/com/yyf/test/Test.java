package com.yyf.test;

import com.yyf.homework.AllMethods;

/**
 * @author yyf
 * @date 2023/3/24 16:55
 * @Description
 */
public class Test {
    @org.junit.Test
    public void test01(){
        AllMethods allMethods = new AllMethods();
        String http = allMethods.reverseStrOne("http");
        System.out.println(http);
    }
}
