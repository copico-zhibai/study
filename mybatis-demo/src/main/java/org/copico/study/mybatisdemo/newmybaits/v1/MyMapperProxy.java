package org.copico.study.mybatisdemo.newmybaits.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author owen
 */
public class MyMapperProxy implements InvocationHandler {
    private MySqlSession sqlSession;

    public MyMapperProxy(MySqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(MyConfiguration.TestMapperXml.namespace)) {
            String sql = MyConfiguration.TestMapperXml.methodSqMapping.get(method.getName());
            return sqlSession.selectOne(sql, String.valueOf(args[0]));
        }
        return method.invoke(this, args);
    }
}
