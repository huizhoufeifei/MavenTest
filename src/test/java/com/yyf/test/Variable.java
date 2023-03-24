package com.yyf.test;

public class Variable {
    public static void main(String[] args) {
        String a = "a";
        StringBuilder b = new StringBuilder("a");
        StringBuilder c = b;
//        b = new StringBuilder("c");
        changeValue(a,b,c);
//        c = c.append(b);
        System.out.println(a + "\t" + b + "\t" + c);
    }

    static void changeValue(String a,StringBuilder b,StringBuilder c){
        a = "ab";
        b = new StringBuilder("b");
        c = c.append(b);
    }

}
