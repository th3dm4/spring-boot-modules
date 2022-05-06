package com.test.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

//此处@Component可省略，不影响运行
//@Component
@Data
public class User {
    private String name;

    private String age;

    private String address;
}
