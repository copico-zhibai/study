package org.copico.study.mybatisdemo.newmybaits.v1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author owen
 */
public class MyConfiguration {
    public <T> T getMapper(Class<T> clazz, MySqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new MyMapperProxy(sqlSession));
    }

    static class TestMapperXml {
        public static final String namespace = "org.copico.study.mybatisdemo.newmybaits.v1.TestMapper";

        public static final Map<String, String> methodSqMapping = new HashMap<>();

        static {
            methodSqMapping.put("selectByPrimaryKey", "select * from user where id = %d");
        }
    }
}
