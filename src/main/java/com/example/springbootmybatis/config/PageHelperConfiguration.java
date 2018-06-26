package com.example.springbootmybatis.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: shihongwei
 * @Date: 2018/6/26 18:59
 * @Description:
 */
@Slf4j
@Configuration
public class PageHelperConfiguration {

    @Bean
    public PageHelper pageHelper() {
        log.info("------Register MyBatis PageHelper");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        //通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
        p.setProperty("pageSizeZero", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
