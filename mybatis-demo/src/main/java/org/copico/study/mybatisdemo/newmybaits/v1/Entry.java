package org.copico.study.mybatisdemo.newmybaits.v1;

import java.util.Map;

/**
 * @author owen
 */
public class Entry {
    public static void main(String[] args) {
        MySqlSession sqlSession = new MySqlSession(new MyConfiguration(), new SimpleExecutor());
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        Map map = mapper.selectByPrimaryKey(1);
        System.out.println(map);
    }
}
