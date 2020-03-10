package org.copico.study.mybatisdemo.jdbc;

import java.sql.*;

/**
 * @author owen
 */
public class JdbcTest {
    /**
     * 1.加载驱动程序
     * 2.获得数据库连接
     * 3.操作数据库
     * 4.处理执行结果
     * 5.释放资源
     *
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/study?userSSL=false";
        String USER = "root";
        String PASSWORD = "root";
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取数据库连接
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库
        String sql = "select * from user where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"may");
        ResultSet resultSet = preparedStatement.executeQuery();

        //String sql = "select * from user where username = 'may'";
        //Statement statement = connection.createStatement();
        //ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("id"));
        }
        connection.close();
        resultSet.close();
        preparedStatement.close();
        //statement.close();
    }
}
