package com.aique.db.jdbc.pg;

import com.aique.db.jdbc.cache.Cache;
import com.aique.db.jdbc.dao.UserDao;
import com.aique.db.jdbc.dao.UserDaoImpl;
import com.aique.db.jdbc.entity.User;

public class ApplicationMain {

    public static void main(String[] args) {
        Cache cache= new Cache();
        UserDao userDao = new UserDaoImpl(cache);
//        User u = new User();
//        u.setId(1L);
//        u.setName("Zara");
//        u.setEmail("change@email.com");
//        u.setCountry("India");
//        u.setPassword("pass1");
//        userDao.updateUser(u);
         User u = userDao.getUser(1L).get();

         System.out.println(u.getId() + "," + u.getName() + "," + u.getEmail() + "," + u.getCountry()+ "," + u.getPassword());

        User u1 = userDao.getUser(1L).get();

        System.out.println(u1.getId() + "," + u1.getName() + "," + u1.getEmail() + "," + u1.getCountry()+ "," + u1.getPassword());

    }
}
