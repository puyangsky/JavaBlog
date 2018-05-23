package com.puyangsky.blog.service.impl;

import com.puyangsky.blog.dao.UserDao;
import com.puyangsky.blog.model.User;
import com.puyangsky.blog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * Author:      puyangsky
 * Date:        2018/5/24 上午12:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        return userDao.insertUser(user) == 1;
    }

    @Override
    public boolean deleteUser(String username) {
        return userDao.deleteByUsername(username) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateByUsername(user.getUsername(),
                user.getPassword()) == 1;
    }

    @Override
    public boolean authUser(String username, String password) {
        String md5Pwd = DigestUtils.md5DigestAsHex(password.getBytes());
        return userDao.selectByUsernameAndPwd(username, md5Pwd) != null;
    }
}
