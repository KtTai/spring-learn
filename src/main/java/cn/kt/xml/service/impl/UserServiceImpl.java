package cn.kt.xml.service.impl;

import cn.kt.xml.dao.UserDao;
import cn.kt.xml.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;


    @Override
    public void userTest(){
        String s = userDao.daoTest();
        System.out.println("service:"+s);
    }

    @Override
    public String userTest1(){
        String s = userDao.daoTest();
        int i = 1 / 0;
        System.out.println("service1:"+s);
        return s;
    }

    @Override
    public String userTest2(){
        String s = userDao.daoTest();
//        int i = 1 / 0;
        System.out.println("service2:"+s);
        return s;
    }



    public UserDao getUserDao() {
        return this.userDao;
    }

    public void setUserDao(final UserDao userDao) {
        this.userDao = userDao;
    }
}
