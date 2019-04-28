package com.ssh.dao;

import com.ssh.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author furg@senthink.com
 * @date 2019/4/28
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public User getUser(Integer uid) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, uid);
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        System.out.println("=================" + user.getUname());
    }
}
