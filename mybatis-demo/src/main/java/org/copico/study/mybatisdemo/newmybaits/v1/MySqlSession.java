package org.copico.study.mybatisdemo.newmybaits.v1;

/**
 * @author owen
 */
public class MySqlSession {
    private MyConfiguration configuration;
    private MyExecutor executor;

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz,this);
    }

    public <T> T selectOne(String statement, String parameter) {
        return executor.query(statement, parameter);
    }

    public MySqlSession(MyConfiguration configuration, MyExecutor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }
}
