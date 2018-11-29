package cn.zhangspace.springbootvalidation.controller;


import cn.zhangspace.springbootvalidation.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {


    @RequestMapping("queryUser")
    public User getUser(@Valid User user){
       return  user;
    }
}
