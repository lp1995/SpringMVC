package com.mello.spring.dao.rabc.impl;

import com.mello.spring.dao.common.impl.DaoImpl;
import com.mello.spring.dao.rabc.UserDao;
import com.mello.spring.entity.User;

import java.util.List;

/**
 * Created by lenovo on 2017/6/29.
 */
public class UserDaoImpl extends DaoImpl<User,Integer> implements UserDao {


    @Override
    public List<User> getAllList() {
        return super.getAll();
    }
}
