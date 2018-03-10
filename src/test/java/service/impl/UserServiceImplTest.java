package service.impl;


import com.google.gson.Gson;
import config.RootConfig;
import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setEmail("tom@gmail.com");
        user.setPassword("123456");

        userService.saveUser(user);

    }

    @Test
    public void jedisTest() {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        jedis.lpush("list", "tom");
    }

    @Test
    public void gsonTest() {
        Gson gson = new Gson();
        String json = gson.toJson(
                new User(1, "Tom", "password", 10, new Timestamp(System.currentTimeMillis())));
        System.out.println(json);
    }

    @Test
    public void test1(){
        Class c = java.util.Date.class;//直接用对象调出
        Method[] methods = c.getDeclaredMethods();
        for (Method method :methods)
        System.out.println(methods);


        Class<Integer> c1 =int.class;    //第一种直接调.class
        Class<? extends Number> c11 = int.class;
        Class<double[]> c2 = double[].class;

    }


    }