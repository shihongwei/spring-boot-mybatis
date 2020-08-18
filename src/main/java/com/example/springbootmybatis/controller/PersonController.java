package com.example.springbootmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmybatis.entity.Person;
import com.example.springbootmybatis.service.PersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author : shihongwei
 * @Date: 2018/6/26 19:11
 * @Description:
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/queryall", method = RequestMethod.GET)
    public PageInfo<Person> queryAll(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                     @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Person> list = personService.selectAllUsers();
        PageInfo<Person> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
