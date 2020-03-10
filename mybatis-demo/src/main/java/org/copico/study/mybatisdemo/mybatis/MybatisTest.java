package org.copico.study.mybatisdemo.mybatis;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

/**
 * @author owen
 */
public class MybatisTest {

    public static void main(String[] args) {
        PooledDataSource pooledDataSource = new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/study", "root", "root");
        JdbcTransactionFactory jdbcTransactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("test", jdbcTransactionFactory, pooledDataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(UserDao.class);
        //构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //UserDao mapper = sqlSession.getMapper(UserDao.class);
        //User user = mapper.getById(1L);
        User user = sqlSession.selectOne("org.copico.study.mybatisdemo.mybatis.UserDao.getById", 1L);
        System.out.println(user);
        sqlSession.close();
    }

}
