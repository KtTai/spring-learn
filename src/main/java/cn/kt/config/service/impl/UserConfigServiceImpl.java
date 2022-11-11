package cn.kt.config.service.impl;

import cn.kt.config.dao.UserConfigDao;
import cn.kt.config.service.UserConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserConfigServiceImpl implements UserConfigService {

    @Autowired
    private UserConfigDao userConfigDao;

    public UserConfigServiceImpl(UserConfigDao userConfigDao) {
        this.userConfigDao = userConfigDao;
    }

    @Override
    public void testConfigService(){
        userConfigDao.testConfigDao();
    }
}
