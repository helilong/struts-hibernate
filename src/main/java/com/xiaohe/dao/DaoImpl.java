package com.xiaohe.dao;

import com.xiaohe.pojo.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
/**
 * dao层
 */
public class DaoImpl implements Dao {

    @Override
    public void finAdd(User user) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.save(user);
        session.close();
        sf.close();
    }
    @Override
    public void finDelete(int id) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.delete(id);
        session.close();
        sf.close();
    }
    @Override
    public void finUpdate(User user) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.update(user);
        session.close();
        sf.close();
    }
    @Override
    public List<User> finAll() {
        List<User> list = new ArrayList<User>();
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Query query = s.createQuery("from User");
        s.close();
        sf.close();
        return list;

    }

    @Override
    public User login(User user) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
       Transaction ts = session.beginTransaction();
       Query query = session.createQuery("from User where user=? and password=?");
       query.setParameter(0,user.getUser());
       query.setParameter(1,user.getPassword());
       User u =  (User) query.uniqueResult();
       ts.commit();
        session.close();
        sf.close();
        return u;
    }

    @Override
    public User get(int id) {
        User user = null;
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        user = session.get(User.class,id);
        session.close();
        sf.close();
        return user;
    }
}
