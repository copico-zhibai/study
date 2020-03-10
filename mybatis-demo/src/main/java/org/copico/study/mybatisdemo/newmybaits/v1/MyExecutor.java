package org.copico.study.mybatisdemo.newmybaits.v1;

/**
 * @author owen
 */
public interface MyExecutor {
    <T> T query(String statement, String parameter);
}
