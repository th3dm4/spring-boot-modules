package com.test.service;

import com.test.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class QueryServiceImpl implements QueryService{
    @Override
    public User findUser() {
        User myUser = new User();
        myUser.setAge("22");
        myUser.setName("老王");
        return myUser;
    }
}
