package com.aitzl.test.mapper;

import com.aitzl.demo.entity.User;
import com.aitzl.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: Zhongli·Tang
 * @Date: 2020-10-18 11:48
 * @Version: v1.0.0
 * @Modified:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
//web项目，junit需要模拟servletContext，所以要加@webAppConfiguration
@WebAppConfiguration
//告诉Junit Spring配置文件
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void findById() throws Exception{
        Long id=1000l;
        User user=userMapper.findById(id);
        System.out.println(user.toString());

    }
}
