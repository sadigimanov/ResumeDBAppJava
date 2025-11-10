package com.company.main;


import com.company.bean.User;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.UserDaoInter;
import java.util.List;


public class Main {  // Java Database Connectivity , JDBC API
    public static void main(String[] args) throws Exception {

        UserDaoInter userDao = Context.instanceUserDao();

        System.out.println(userDao.getAll());
    }
}