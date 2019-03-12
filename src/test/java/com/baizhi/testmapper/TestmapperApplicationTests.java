package com.baizhi.testmapper;

import com.baizhi.testmapper.dao.UserDao;
import com.baizhi.testmapper.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestmapperApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void contextLoads() {
        List<User> list = userDao.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

}
