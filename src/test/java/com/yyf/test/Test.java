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

    @org.junit.Test
    public void test02(){
        AllMethods allMethods = new AllMethods();
        String http = allMethods.reverseStrTwo("www.http");
        System.out.println(http);
    }

    @org.junit.Test
    public void test03(){
        System.out.println("hot-fix第一次提交代码");
    }

    @org.junit.Test
    public void test04(){
        System.out.println("hot-fix第二次提交代码");
    }

    @org.junit.Test
    public void testMerge(){
        System.out.println("master对应hot-fix第二次提交代码");
    }

    @org.junit.Test
    public void testPush(){
        System.out.println("修改代码push到GitHub中");
    }
    
    @org.junit.Test
    public void testPull(){
        System.out.println("GitHub修改代码pull到idea中");
    }
}
