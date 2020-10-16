package com.turling.service;

import com.turling.dao.UserMapper;
import com.turling.entity.User;
import com.turling.entity.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;


    @Override
    public User Userlogin(User user) {
        UserExample userexample=new UserExample();
        userexample.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(userexample);
        if(users!=null&& users.size()>0){
        return users.get(0);
        }
        return null;
    }
}
