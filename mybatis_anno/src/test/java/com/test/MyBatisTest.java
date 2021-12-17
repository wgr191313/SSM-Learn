package com.test;

import com.domain.User;
import com.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-16
 */
public class MyBatisTest {

    private UserMapper mapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
    }




    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("tom");
        user.setPassword("abc");
        mapper.save(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(7);
        user.setUsername("lucy");
        user.setPassword("123");
        mapper.update(user);
    }

    @Test
    public void testDelete(){
        mapper.delete(8);
    }

    @Test
    public void testFindById(){
        User user=mapper.findById(2);
        System.out.println(user);
    }

    @Test
    public void testFindAll(){
        List<User> all=mapper.findAll();
        for (User user:
             all) {
            System.out.println(user);
        }
    }



}
