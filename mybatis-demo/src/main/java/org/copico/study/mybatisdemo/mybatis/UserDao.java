package org.copico.study.mybatisdemo.mybatis;

import org.apache.ibatis.annotations.Select;

/**
 * @author owen
 */
public interface UserDao {

    @Select("select * from user where id = #{id}")
    //@Results({
    //        @Result(column = "id",property = "id"),
    //        @Result(column = "username",property = "username")
    //})
    User getById(Long id);

}
