package org.copico.study.mybatisdemo.newmybaits.v1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author owen
 */
public class SimpleExecutor implements MyExecutor {
    @Override
    public <T> T query(String statement, String parameter) {
        Map<String, String> map = new HashMap<>();
        String URL = "jdbc:mysql://localhost:3306/study?userSSL=false";
        String USER = "root";
        String PASSWORD = "root";
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取数据库连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.操作数据库
            String sql = String.format(statement, Integer.valueOf(parameter));
            preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.setString(1, "may");
            resultSet = preparedStatement.executeQuery();

            //String sql = "select * from user where username = 'may'";
            //Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                map.put("id", resultSet.getString("id"));
                map.put("username", resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return (T) map;
    }
}
