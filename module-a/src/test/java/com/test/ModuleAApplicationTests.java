package com.test;

import com.alibaba.fastjson.JSON;
import com.test.pojo.User;
import com.test.service.QueryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ModuleAApplicationTests {
    @Autowired
    private QueryService queryService;

    @Test
    void contextLoads() {
    }

    @Test
    void findUserInfo(){
        User myUser = queryService.findUser();
        System.out.println(JSON.toJSONString(myUser));
    }

}
