package cn.kt.xml.dao.impl;

import cn.kt.xml.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public String daoTest() {
        System.out.println("userTest");
        return "userTest";
    }
}
