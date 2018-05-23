package com.puyangsky.blog.service;

import com.puyangsky.blog.model.User;
import org.springframework.stereotype.Service;

/**
 * Author:      puyangsky
 * Date:        2018/5/24 上午12:50
 */
@Service
public interface UserService {
    boolean addUser(User user);
    boolean deleteUser(String username);
    boolean updateUser(User user);
    boolean authUser(String username, String password);
}
