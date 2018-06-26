package com.example.springbootmybatis.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.springbootmybatis.entity.Person;
import com.example.springbootmybatis.mapper.PersonMapper;

/**
 * @Auther: shihongwei
 * @Date: 2018/6/26 19:10
 * @Description:
 */
@Service
public class PersonService {

    @Resource
    private PersonMapper personMapper;

    public List<Person> selectAllUsers() {
        return personMapper.selectAllPersons();
    }
}
