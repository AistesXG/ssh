package com.ssh.service;

import com.ssh.dao.UserDao;
import com.ssh.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author furg@senthink.com
 * @date 2019/4/28
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Transactional(rollbackFor = {Exception.class, RuntimeException.class})
    public User getUser(Integer uid) {
        return userDao.getUser(uid);
    }

    @Transactional(rollbackFor = {Exception.class, RuntimeException.class})
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
