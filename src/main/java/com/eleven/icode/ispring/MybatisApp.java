package com.eleven.icode.ispring;

import com.eleven.icode.ispring.entity.UserNew;
import com.eleven.icode.ispring.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisApp {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        Reader reader;
        try {
            //将XML配置文件构建为Configuration配置类
            reader = Resources.getResourceAsReader(resource);
            // 通过加载配置文件流构建一个SqlSessionFactory  DefaultSqlSessionFactory
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            // 数据源 执行器  DefaultSqlSession
            SqlSession session = sqlMapper.openSession();
            try {
                // 执行查询底层执行jdbc
                UserNew user = session.selectOne("com.tuling.mapper.UserMapper.selectById", 1L);
                System.out.println(user.getUserName());

                UserMapper mapper = session.getMapper(UserMapper.class);
                System.out.println(mapper.getClass());
                user = mapper.selectById(1L);
                System.out.println(user.getUserName());
                user = mapper.selectById(1L);
                System.out.println(user.getUserName());
                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
