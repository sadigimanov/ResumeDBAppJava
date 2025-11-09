package com.company.main;

import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.UserDaoInter;

public class Context {   // Factory Pattern
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
}
