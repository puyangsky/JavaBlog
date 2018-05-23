package com.puyangsky.blog.dao;

import com.puyangsky.blog.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Author:      puyangsky
 * Date:        2018/5/23 下午2:49
 */
@Repository
public interface UserDao {
    int insertUser(User user);
    int deleteByUsername(String username);
    User selectByUsernameAndPwd(@Param("username") String username,
                                @Param("password") String password);
    int updateByUsername(@Param("username") String username,
                         @Param("password") String password);
}
