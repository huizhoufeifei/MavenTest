package com.yyf.homework;

import redis.clients.jedis.Jedis;

public class TestRedis {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.12.195:3307/fh_learn?serverTimeZone=GMT%2B8";
        String username = "root";
        String password = "root";
        Jedis jedis = new Jedis("192.168.101.71", 6379);
        AllMethods Am = new AllMethods();
        Am.selectAll(url,username,password,jedis);
        Am.delete(url,username,password,jedis);

    }

}
