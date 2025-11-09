package com.company.dao.inter;

import com.company.bean.User;

import java.util.List;

public interface UserDaoInter {        // Dao - Data Access Object- bir basa dataya muraciet etmek ucun istifade etdiyimiz object
    public List<User> getAll();
    public User getById(int id);
    public boolean updateUser(User u);
    public boolean removeUser(int id);
}
