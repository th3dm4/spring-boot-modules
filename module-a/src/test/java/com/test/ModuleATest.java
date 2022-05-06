package com.test;

import com.alibaba.fastjson.JSON;
import com.test.pojo.User;
import com.test.service.QueryService;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//SpringBootTest默认找的是main方法所在的类，若想指定对应的类，则用classes =
//@SpringBootTest(classes = {ModuleAApplication.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleATest {
    @Autowired
    private QueryService queryService;

    @Test
    public void findUserInfo(){
        User myUser = queryService.findUser();
        System.out.println(JSON.toJSONString(myUser));
    }
}
