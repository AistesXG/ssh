package com.ssh.dao;

import com.ssh.model.User;

/**
 * @author furg@senthink.com
 * @date 2019/4/28
 */
public interface UserDao {

    User getUser(Integer uid);

    void saveUser(User user);

}
