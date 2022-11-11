package cn.kt.config.dao.impl;

import cn.kt.config.dao.UserConfigDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserConfigDaoImpl implements UserConfigDao {
    @Override
    public void testConfigDao() {
        System.out.println("testConfigDao");
    }
}
