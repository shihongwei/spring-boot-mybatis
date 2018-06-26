package com.example.springbootmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.springbootmybatis.entity.Person;

/**
 * @Auther: shihongwei
 * @Date: 2018/6/26 19:10
 * @Description:
 */
@Mapper
public interface PersonMapper {

    List<Person> selectAllPersons();
}
