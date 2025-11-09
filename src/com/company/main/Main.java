package com.company.main;


import com.company.bean.User;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.UserDaoInter;
import java.util.List;


public class Main {  // Java Database Connectivity , JDBC API
    public static void main(String[] args) throws Exception {
        UserDaoInter userDao = Context.instanceUserDao();
//        UserDaoInter userDao = new UserDaoImpl();
       /* List<User> list = userDao.getAll();
        System.out.println("list=" + list);*/

        User u = userDao.getById(1);
        u.setName("Sadiq");
        userDao.updateUser(u);
    }
}