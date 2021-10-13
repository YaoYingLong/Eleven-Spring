package com.eleven.icode.ispring.config;

import com.eleven.icode.ispring.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author by YingLong on 2021/10/13
 */
@Configuration
@MapperScan(basePackages = {"com.eleven.icode.ispring.mapper"})
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        // 设置 MyBatis 配置文件路径
        factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        // 设置 SQL 映射文件路径
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
//        factoryBean.setTypeAliases(User.class);
        return factoryBean;
    }
}
