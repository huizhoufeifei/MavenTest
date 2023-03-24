package com.yyf.homework;

import redis.clients.jedis.Jedis;

import java.sql.*;

public class AllMethods {
    static Connection getConnection(String url, String username, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    void selectAll(String url,String username,String password,Jedis jedis){
        try {
            Connection connection = getConnection(url, username, password);
            String sql = "select * from user_info";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                User user = new User(resultSet.getInt(1), resultSet.getString(2)
                        , resultSet.getInt(3), resultSet.getString(4));
                System.out.println(user);
                jedis.set(user.getId().toString(),user.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void delete(String url,String username,String password,Jedis jedis){
        try {
            Connection connection = getConnection(url, username, password);
            String sql = "update user_info set name = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"李白");
            statement.setInt(2,10);
            int bool = statement.executeUpdate();
            if (bool > 0){
                jedis.del("10");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public String reverseStrOne(String str){
        char[] chars = str.toCharArray();
        String url = "";
        for (int i = chars.length -1; i >= 0; i--) {
            url += chars[i];
        }
        return url;
    }

    public String reverseStrTwo(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
