package com.xiaohe.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {

    static SessionFactory  sf= null;
    static Session session = null;

    static {
        sf = new Configuration().configure().buildSessionFactory();
    }
    	//提供返回与本地线程帮的session的方法
    	public static Session getSessionobject() {
          return null;
    	}

    //提供方法返回sessionFactory
    	public static SessionFactory getSessionFactory() {
    	    return sf;
    	}
        //关闭方法
        public void getClose(Session session){
           sf.close();
           session.clear();
    }
}
